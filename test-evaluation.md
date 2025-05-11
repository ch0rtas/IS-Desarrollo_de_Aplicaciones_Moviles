# Evaluación Práctica de Desarrollo Móvil

## Preguntas

### Android Nativo

1. Analiza el siguiente código y encuentra el error:
```kotlin
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
```
a) Falta el import de Button
b) Falta el import de Intent
c) Falta el import de Bundle
d) No hay error

2. ¿Qué error hay en este código de Firebase?
```kotlin
class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        auth.signInWithEmailAndPassword("email", "password")
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    // Login exitoso
                }
            }
    }
}
```
a) No se inicializa FirebaseApp
b) No se inicializa auth
c) Falta el import de FirebaseAuth
d) No hay error

3. En este código de RecyclerView, ¿qué falta?
```kotlin
class MyAdapter(private val items: List<String>) : 
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.textView)
    }
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }
    
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }
}
```
a) Falta el método getItemCount()
b) Falta el import de RecyclerView
c) Falta el import de View
d) No hay error

### Flutter/Dart

4. ¿Qué error hay en este widget Flutter?
```dart
class MyWidget extends StatelessWidget {
  final String title;
  
  @override
  Widget build(BuildContext context) {
    return Container(
      child: Text(title),
      color: Colors.blue,
    );
  }
}
```
a) Falta el constructor
b) Falta el import de material.dart
c) Container no tiene la propiedad child
d) No hay error

5. En este código de Firebase en Flutter, ¿qué falta?
```dart
class AuthService {
  final FirebaseAuth _auth = FirebaseAuth.instance;
  
  Future<UserCredential> signIn(String email, String password) async {
    try {
      return await _auth.signInWithEmailAndPassword(
        email: email,
        password: password
      );
    } catch (e) {
      print(e);
      return null;
    }
  }
}
```
a) Falta el import de firebase_auth
b) No se puede retornar null en una función Future
c) Falta manejar el error correctamente
d) No hay error

6. ¿Qué error hay en este código de Provider?
```dart
class UserProvider extends ChangeNotifier {
  User _user;
  
  User get user => _user;
  
  void setUser(User user) {
    _user = user;
  }
}
```
a) Falta el import de provider
b) Falta llamar a notifyListeners()
c) Falta el constructor
d) No hay error

### Firebase

7. En este código de Firestore, ¿qué error hay?
```kotlin
val db = FirebaseFirestore.getInstance()
db.collection("users")
    .document(userId)
    .set(userData)
    .addOnSuccessListener {
        // Éxito
    }
```
a) Falta el import de FirebaseFirestore
b) Falta manejar el error
c) Falta inicializar Firebase
d) No hay error

8. ¿Qué falta en este código de Firebase Storage?
```kotlin
val storage = FirebaseStorage.getInstance()
val storageRef = storage.reference
val imageRef = storageRef.child("images/profile.jpg")

imageRef.putFile(imageFile)
    .addOnSuccessListener {
        // Éxito
    }
```
a) Falta el import de FirebaseStorage
b) Falta manejar el error
c) Falta obtener la URL de descarga
d) No hay error

### Android Nativo (Continuación)

9. ¿Qué error hay en este código de Navigation Component?
```kotlin
class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
    }
}
```
a) Falta el import de NavController
b) Falta el import de NavHostFragment
c) Falta inicializar el NavController
d) No hay error

10. En este código de ViewModel, ¿qué falta?
```kotlin
class UserViewModel : ViewModel() {
    private val _users = MutableLiveData<List<User>>()
    val users: LiveData<List<User>> = _users
    
    fun loadUsers() {
        viewModelScope.launch {
            // Cargar usuarios
        }
    }
}
```
a) Falta el import de ViewModel
b) Falta el import de LiveData
c) Falta el import de viewModelScope
d) No hay error

### Flutter/Dart (Continuación)

11. ¿Qué error hay en este código de StreamBuilder?
```dart
StreamBuilder<User>(
  stream: _auth.authStateChanges(),
  builder: (context, snapshot) {
    if (snapshot.hasData) {
      return HomeScreen();
    }
    return LoginScreen();
  },
)
```
a) Falta el import de StreamBuilder
b) Falta manejar el estado de error
c) Falta manejar el estado de carga
d) No hay error

12. En este código de StatefulWidget, ¿qué falta?
```dart
class CounterWidget extends StatefulWidget {
  @override
  _CounterWidgetState createState() => _CounterWidgetState();
}

class _CounterWidgetState extends State<CounterWidget> {
  int _counter = 0;
  
  void _incrementCounter() {
    setState(() {
      _counter++;
    });
  }
}
```
a) Falta el método build
b) Falta el import de material.dart
c) Falta el constructor
d) No hay error

### Firebase (Continuación)

13. ¿Qué error hay en este código de Firebase Authentication?
```kotlin
class AuthViewModel : ViewModel() {
    private val auth = FirebaseAuth.getInstance()
    
    fun signOut() {
        auth.signOut()
    }
    
    fun getCurrentUser(): FirebaseUser? {
        return auth.currentUser
    }
}
```
a) Falta el import de FirebaseAuth
b) FirebaseUser está deprecado
c) Falta manejar el error de signOut
d) No hay error

14. En este código de Firebase Realtime Database, ¿qué falta?
```kotlin
val database = FirebaseDatabase.getInstance()
val myRef = database.getReference("users")

myRef.setValue(user)
    .addOnSuccessListener {
        // Éxito
    }
```
a) Falta el import de FirebaseDatabase
b) Falta manejar el error
c) Falta establecer las reglas de seguridad
d) No hay error

### Android Nativo (Continuación)

15. ¿Qué error hay en este código de Coroutines?
```kotlin
class MainActivity : AppCompatActivity() {
    private val scope = CoroutineScope(Dispatchers.Main)
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        scope.launch {
            val result = withContext(Dispatchers.IO) {
                // Operación larga
            }
            updateUI(result)
        }
    }
}
```
a) Falta el import de CoroutineScope
b) Falta cancelar el scope en onDestroy
c) Falta manejar excepciones
d) No hay error

16. En este código de Room Database, ¿qué falta?
```kotlin
@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    fun getAllUsers(): List<User>
    
    @Insert
    fun insertUser(user: User)
    
    @Update
    fun updateUser(user: User)
}
```
a) Falta el import de Dao
b) Falta el import de Query
c) Falta el método delete
d) No hay error

### Flutter/Dart (Continuación)

17. ¿Qué error hay en este código de FutureBuilder?
```dart
FutureBuilder<String>(
  future: _getData(),
  builder: (context, snapshot) {
    if (snapshot.hasData) {
      return Text(snapshot.data);
    }
    return CircularProgressIndicator();
  },
)
```
a) Falta el import de FutureBuilder
b) Falta manejar el estado de error
c) Falta el import de CircularProgressIndicator
d) No hay error

18. En este código de Provider, ¿qué falta?
```dart
class CounterProvider extends ChangeNotifier {
  int _count = 0;
  
  int get count => _count;
  
  void increment() {
    _count++;
  }
}
```
a) Falta el import de provider
b) Falta llamar a notifyListeners()
c) Falta el constructor
d) No hay error

### Firebase (Continuación)

19. ¿Qué error hay en este código de Cloud Functions?
```javascript
exports.onUserCreated = functions.auth.user().onCreate((user) => {
  return admin.firestore().collection('users').doc(user.uid).set({
    email: user.email,
    createdAt: admin.firestore.FieldValue.serverTimestamp()
  });
});
```
a) Falta el import de functions
b) Falta el import de admin
c) Falta manejar el error
d) No hay error

20. En este código de Firebase Cloud Messaging, ¿qué falta?
```kotlin
class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        
        remoteMessage.notification?.let { notification ->
            // Mostrar notificación
        }
    }
}
```
a) Falta el import de FirebaseMessagingService
b) Falta crear el canal de notificación
c) Falta el import de RemoteMessage
d) No hay error

### Soluciones

1. b) Falta el import de Intent
   ```kotlin
   import android.content.Intent
   ```

2. b) No se inicializa auth
   ```kotlin
   auth = FirebaseAuth.getInstance()
   ```

3. a) Falta el método getItemCount()
   ```kotlin
   override fun getItemCount() = items.size
   ```

4. c) Container no tiene la propiedad child
   ```dart
   return Container(
     child: Text(title),  // Debería ser 'child: Text(title)'
     color: Colors.blue,
   );
   ```

5. b) No se puede retornar null en una función Future
   ```dart
   Future<UserCredential?> signIn(String email, String password) async {
     try {
       return await _auth.signInWithEmailAndPassword(
         email: email,
         password: password
       );
     } catch (e) {
       print(e);
       return null;
     }
   }
   ```

6. b) Falta llamar a notifyListeners()
   ```dart
   void setUser(User user) {
     _user = user;
     notifyListeners();
   }
   ```

7. b) Falta manejar el error
   ```kotlin
   db.collection("users")
       .document(userId)
       .set(userData)
       .addOnSuccessListener {
           // Éxito
       }
       .addOnFailureListener { e ->
           // Manejar error
       }
   ```

8. c) Falta obtener la URL de descarga
   ```kotlin
   imageRef.putFile(imageFile)
       .addOnSuccessListener {
           imageRef.downloadUrl.addOnSuccessListener { uri ->
               // URL de descarga
           }
       }
   ```

9. b) Falta el import de NavHostFragment
   ```kotlin
   import androidx.navigation.fragment.NavHostFragment
   ```

10. c) Falta el import de viewModelScope
    ```kotlin
    import androidx.lifecycle.viewModelScope
    ```

11. c) Falta manejar el estado de carga
    ```dart
    StreamBuilder<User>(
      stream: _auth.authStateChanges(),
      builder: (context, snapshot) {
        if (snapshot.connectionState == ConnectionState.waiting) {
          return LoadingScreen();
        }
        if (snapshot.hasData) {
          return HomeScreen();
        }
        return LoginScreen();
      },
    )
    ```

12. a) Falta el método build
    ```dart
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        body: Center(
          child: Text('$_counter'),
        ),
        floatingActionButton: FloatingActionButton(
          onPressed: _incrementCounter,
          child: Icon(Icons.add),
        ),
      );
    }
    ```

13. b) FirebaseUser está deprecado
    ```kotlin
    fun getCurrentUser(): User? {
        return auth.currentUser
    }
    ```

14. b) Falta manejar el error
    ```kotlin
    myRef.setValue(user)
        .addOnSuccessListener {
            // Éxito
        }
        .addOnFailureListener { e ->
            // Manejar error
        }
    ```

15. b) Falta cancelar el scope en onDestroy
    ```kotlin
    override fun onDestroy() {
        super.onDestroy()
        scope.cancel()
    }
    ```

16. c) Falta el método delete
    ```kotlin
    @Delete
    fun deleteUser(user: User)
    ```

17. b) Falta manejar el estado de error
    ```dart
    FutureBuilder<String>(
      future: _getData(),
      builder: (context, snapshot) {
        if (snapshot.hasError) {
          return Text('Error: ${snapshot.error}');
        }
        if (snapshot.hasData) {
          return Text(snapshot.data);
        }
        return CircularProgressIndicator();
      },
    )
    ```

18. b) Falta llamar a notifyListeners()
    ```dart
    void increment() {
      _count++;
      notifyListeners();
    }
    ```

19. c) Falta manejar el error
    ```javascript
    exports.onUserCreated = functions.auth.user().onCreate((user) => {
      return admin.firestore().collection('users').doc(user.uid).set({
        email: user.email,
        createdAt: admin.firestore.FieldValue.serverTimestamp()
      }).catch(error => {
        console.error('Error creating user document:', error);
      });
    });
    ```

20. b) Falta crear el canal de notificación
    ```kotlin
    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                "default",
                "Default Channel",
                NotificationManager.IMPORTANCE_DEFAULT
            )
            val notificationManager = getSystemService(NotificationManager::class.java)
            notificationManager.createNotificationChannel(channel)
        }
    }
    ```
