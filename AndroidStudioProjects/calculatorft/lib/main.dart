import 'package:flutter/material.dart';
import 'theme/app_theme.dart';
import 'widgets/calculator_button.dart';
import 'models/calculator_model.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Calculadora',
      theme: AppTheme.darkTheme,
      home: const CalculatorApp(),
    );
  }
}

class CalculatorApp extends StatefulWidget {
  const CalculatorApp({super.key});

  @override
  State<CalculatorApp> createState() => _CalculatorAppState();
}

class _CalculatorAppState extends State<CalculatorApp> {
  final CalculatorModel _calculator = CalculatorModel();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: SafeArea(
        child: Column(
          children: [
            Expanded(
              child: Container(
                padding: const EdgeInsets.all(16.0),
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.end,
                  children: [
                    // Historial de operaciones
                    Expanded(
                      child: ListView.builder(
                        reverse: true,
                        itemCount: _calculator.operationHistory.length,
                        itemBuilder: (context, index) {
                          return Padding(
                            padding: const EdgeInsets.symmetric(vertical: 4.0),
                            child: Text(
                              _calculator.operationHistory[index],
                              style: Theme.of(context).textTheme.displayMedium?.copyWith(
                                color: Colors.white38,
                                fontSize: 18,
                              ),
                              textAlign: TextAlign.right,
                            ),
                          );
                        },
                      ),
                    ),
                    // Separador
                    if (_calculator.operationHistory.isNotEmpty)
                      Padding(
                        padding: const EdgeInsets.symmetric(vertical: 8.0),
                        child: Divider(
                          color: Colors.white24,
                          thickness: 1,
                        ),
                      ),
                    // Operación actual
                    Container(
                      width: double.infinity,
                      alignment: Alignment.centerRight,
                      child: Column(
                        crossAxisAlignment: CrossAxisAlignment.end,
                        children: [
                          Text(
                            _calculator.history,
                            style: Theme.of(context).textTheme.displayMedium?.copyWith(
                              color: Colors.white70,
                            ),
                          ),
                          Text(
                            _calculator.input,
                            style: Theme.of(context).textTheme.displayLarge,
                          ),
                        ],
                      ),
                    ),
                  ],
                ),
              ),
            ),
            Padding(
              padding: const EdgeInsets.only(bottom: 16.0),
              child: Column(
                children: [
                  Row(
                    children: [
                      CalculatorButton(
                        text: _calculator.canDeleteDigit ? '⌫' : 'C',
                        backgroundColor: const Color(0xFFA5A5AA),
                        textColor: Colors.black,
                        onPressed: () {
                          setState(() {
                            if (_calculator.canDeleteDigit) {
                              _calculator.onDeleteDigit();
                            } else {
                              _calculator.onClearPress();
                            }
                          });
                        },
                      ),
                      CalculatorButton(
                        text: '±',
                        backgroundColor: const Color(0xFFA5A5AA),
                        textColor: Colors.black,
                        onPressed: () {
                          setState(() => _calculator.onToggleSign());
                        },
                      ),
                      CalculatorButton(
                        text: '%',
                        backgroundColor: const Color(0xFFA5A5AA),
                        textColor: Colors.black,
                        onPressed: () {
                          setState(() => _calculator.onPercentage());
                        },
                      ),
                      CalculatorButton(
                        text: '÷',
                        backgroundColor: const Color(0xFFFF9F0A),
                        onPressed: () {
                          setState(() => _calculator.onOperationPress('÷'));
                        },
                      ),
                    ],
                  ),
                  Row(
                    children: [
                      CalculatorButton(
                        text: '7',
                        onPressed: () {
                          setState(() => _calculator.onNumberPress('7'));
                        },
                      ),
                      CalculatorButton(
                        text: '8',
                        onPressed: () {
                          setState(() => _calculator.onNumberPress('8'));
                        },
                      ),
                      CalculatorButton(
                        text: '9',
                        onPressed: () {
                          setState(() => _calculator.onNumberPress('9'));
                        },
                      ),
                      CalculatorButton(
                        text: '×',
                        backgroundColor: const Color(0xFFFF9F0A),
                        onPressed: () {
                          setState(() => _calculator.onOperationPress('×'));
                        },
                      ),
                    ],
                  ),
                  Row(
                    children: [
                      CalculatorButton(
                        text: '4',
                        onPressed: () {
                          setState(() => _calculator.onNumberPress('4'));
                        },
                      ),
                      CalculatorButton(
                        text: '5',
                        onPressed: () {
                          setState(() => _calculator.onNumberPress('5'));
                        },
                      ),
                      CalculatorButton(
                        text: '6',
                        onPressed: () {
                          setState(() => _calculator.onNumberPress('6'));
                        },
                      ),
                      CalculatorButton(
                        text: '-',
                        backgroundColor: const Color(0xFFFF9F0A),
                        onPressed: () {
                          setState(() => _calculator.onOperationPress('-'));
                        },
                      ),
                    ],
                  ),
                  Row(
                    children: [
                      CalculatorButton(
                        text: '1',
                        onPressed: () {
                          setState(() => _calculator.onNumberPress('1'));
                        },
                      ),
                      CalculatorButton(
                        text: '2',
                        onPressed: () {
                          setState(() => _calculator.onNumberPress('2'));
                        },
                      ),
                      CalculatorButton(
                        text: '3',
                        onPressed: () {
                          setState(() => _calculator.onNumberPress('3'));
                        },
                      ),
                      CalculatorButton(
                        text: '+',
                        backgroundColor: const Color(0xFFFF9F0A),
                        onPressed: () {
                          setState(() => _calculator.onOperationPress('+'));
                        },
                      ),
                    ],
                  ),
                  Row(
                    children: [
                      CalculatorButton(
                        text: '0',
                        onPressed: () {
                          setState(() => _calculator.onNumberPress('0'));
                        },
                      ),
                      CalculatorButton(
                        text: '.',
                        onPressed: () {
                          setState(() => _calculator.onNumberPress('.'));
                        },
                      ),
                      CalculatorButton(
                        text: '=',
                        backgroundColor: const Color(0xFFFF9F0A),
                        onPressed: () {
                          setState(() => _calculator.onEqualPress());
                        },
                      ),
                    ],
                  ),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}
