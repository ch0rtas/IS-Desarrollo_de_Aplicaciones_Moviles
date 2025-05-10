class CalculatorModel {
  String _input = '0';
  String _result = '';
  String _operation = '';
  double _firstNumber = 0;
  double _lastNumber = 0;
  bool _isNewNumber = true;
  String _history = '';
  bool _isRepeatingOperation = false;
  final List<String> _operationHistory = [];
  static const int _maxHistoryItems = 10;

  String get input => _input;
  String get result => _result;
  String get history => _history;
  List<String> get operationHistory => _operationHistory;
  bool get canDeleteDigit => !_isNewNumber && (_input.length > 1 || _input != '0');

  void onNumberPress(String number) {
    if (_isNewNumber) {
      _input = number;
      _isNewNumber = false;
      _isRepeatingOperation = false;
    } else {
      _input += number;
    }
    _updateHistory();
  }

  void onOperationPress(String operation) {
    if (!_isNewNumber) {
      _calculateResult();
    }
    _operation = operation;
    _isNewNumber = true;
    _isRepeatingOperation = false;
    _updateHistory();
  }

  void onEqualPress() {
    if (_isRepeatingOperation) {
      _input = _result;
      _firstNumber = double.parse(_result);
      _lastNumber = _lastNumber;
    } else {
      _lastNumber = double.parse(_input);
      _isRepeatingOperation = true;
    }
    _calculateResult();
    _addToOperationHistory();
    _isNewNumber = true;
  }

  void onDeleteDigit() {
    if (canDeleteDigit) {
      _input = _input.substring(0, _input.length - 1);
      if (_input.isEmpty) {
        _input = '0';
        _isNewNumber = true;
      }
      _updateHistory();
    }
  }

  void _calculateResult() {
    double currentNumber = double.parse(_input);
    double result = 0;

    if (_isRepeatingOperation) {
      switch (_operation) {
        case '+':
          result = _firstNumber + _lastNumber;
          break;
        case '-':
          result = _firstNumber - _lastNumber;
          break;
        case '×':
          result = _firstNumber * _lastNumber;
          break;
        case '÷':
          result = _firstNumber / _lastNumber;
          break;
      }
    } else {
      if (_operation.isEmpty) {
        _firstNumber = currentNumber;
        result = currentNumber;
      } else {
        switch (_operation) {
          case '+':
            result = _firstNumber + currentNumber;
            break;
          case '-':
            result = _firstNumber - currentNumber;
            break;
          case '×':
            result = _firstNumber * currentNumber;
            break;
          case '÷':
            result = _firstNumber / currentNumber;
            break;
        }
        _firstNumber = result;
      }
    }

    _result = result.toString();
    _input = _result;
    _isNewNumber = true;
    _updateHistory();
  }

  void onClearPress() {
    _input = '0';
    _result = '';
    _operation = '';
    _firstNumber = 0;
    _lastNumber = 0;
    _isNewNumber = true;
    _isRepeatingOperation = false;
    _history = '';
  }

  void onToggleSign() {
    if (_input != '0') {
      if (_input.startsWith('-')) {
        _input = _input.substring(1);
      } else {
        _input = '-$_input';
      }
      _updateHistory();
    }
  }

  void onPercentage() {
    if (_input != '0') {
      double number = double.parse(_input);
      number = number / 100;
      _input = number.toString();
      _updateHistory();
    }
  }

  void _updateHistory() {
    if (_operation.isNotEmpty) {
      _history = '$_firstNumber $_operation ${_isRepeatingOperation ? _lastNumber : _input}';
    } else {
      _history = _input;
    }
  }

  void _addToOperationHistory() {
    String historyEntry = '$_firstNumber $_operation $_lastNumber = $_result';
    _operationHistory.insert(0, historyEntry);
    if (_operationHistory.length > _maxHistoryItems) {
      _operationHistory.removeLast();
    }
  }
} 