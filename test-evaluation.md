# Evaluación Práctica de Desarrollo Móvil

## Preguntas

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
- a) Falta el import de Button
- b) Falta el import de Intent
- c) Falta el import de Bundle
- d) No hay error

---

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
- a) No se inicializa FirebaseApp
- b) No se inicializa auth
- c) Falta el import de FirebaseAuth
- d) No hay error

---

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
- a) Falta el método getItemCount()
- b) Falta el import de RecyclerView
- c) Falta el import de View
- d) No hay error

---

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
- a) Falta el constructor
- b) Falta el import de material.dart
- c) Container no tiene la propiedad child
- d) No hay error

---

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
- a) Falta el import de firebase_auth
- b) No se puede retornar null en una función Future
- c) Falta manejar el error correctamente
- d) No hay error

---

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
- a) Falta el import de provider
- b) Falta llamar a notifyListeners()
- c) Falta el constructor
- d) No hay error

---

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

---

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

---

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

---

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

---

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

---

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

---

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

---

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

---

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

---

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

---

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

---

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

---

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

---

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

---

21. En este código de Activity, ¿qué error hay?
```kotlin
class ShowUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_user)
        
        val user = intent.getSerializableExtra("user") as User
        textViewName.text = user.name
        textViewEmail.text = user.email
    }
}
```
- a) Falta el import de User
- b) Falta inicializar los TextViews
- c) Falta el import de Bundle
- d) No hay error

---

22. En este código de RecyclerView Adapter, ¿qué falta?
```kotlin
class ContactAdapter(private val contacts: List<Contact>) : 
    RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewName: TextView = view.findViewById(R.id.textViewName)
        val textViewPhone: TextView = view.findViewById(R.id.textViewPhone)
    }
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_contact, parent, false)
        return ViewHolder(view)
    }
    
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacts[position]
        holder.textViewName.text = contact.name
        holder.textViewPhone.text = contact.phone
    }
}
```
- a) Falta el método getItemCount()
- b) Falta el import de RecyclerView
- c) Falta el import de View
- d) No hay error

---

23. En este código de modelo de datos, ¿qué error hay?
```kotlin
data class User(
    val id: Int,
    val name: String,
    val email: String,
    val password: String
) : Serializable
```
- a) Falta el import de Serializable
- b) No se puede serializar una clase de datos
- c) Falta el constructor
- d) No hay error

---

24. En este código de Activity con Navigation Component, ¿qué falta?
```kotlin
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        val navController = findNavController(R.id.nav_host_fragment)
        binding.bottomNav.setupWithNavController(navController)
    }
}
```
- a) Falta el import de findNavController
- b) Falta el import de ActivityMainBinding
- c) Falta el import de Bundle
- d) No hay error

---

25. En este código de widget Flutter, ¿qué error hay?
```dart
class UserProfile extends StatelessWidget {
  final User user;
  
  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        Text(user.name),
        Text(user.email),
        ElevatedButton(
          onPressed: () {
            // Navegar a editar perfil
          },
          child: Text('Editar'),
        ),
      ],
    );
  }
}
```
- a) Falta el import de material.dart
- b) Falta el constructor
- c) Falta el import de User
- d) No hay error

---

26. En este código de FutureBuilder, ¿qué falta?
```dart
FutureBuilder<List<Movie>>(
  future: _getMovies(),
  builder: (context, snapshot) {
    if (snapshot.hasData) {
      return ListView.builder(
        itemCount: snapshot.data.length,
        itemBuilder: (context, index) {
          return MovieCard(movie: snapshot.data[index]);
        },
      );
    }
    return CircularProgressIndicator();
  },
)
```
- a) Falta el import de FutureBuilder
- b) Falta manejar el estado de error
- c) Falta el import de CircularProgressIndicator
- d) No hay error

---

27. En este código de Provider, ¿qué error hay?
```dart
class MovieProvider extends ChangeNotifier {
  List<Movie> _movies = [];
  
  List<Movie> get movies => _movies;
  
  Future<void> loadMovies() async {
    _movies = await MovieService.getMovies();
  }
}
```
- a) Falta el import de provider
- b) Falta llamar a notifyListeners()
- c) Falta el import de Movie
- d) No hay error

---

28. En este código de Firestore, ¿qué error hay?
```kotlin
class MovieRepository {
    private val db = FirebaseFirestore.getInstance()
    
    fun saveMovie(movie: Movie) {
        db.collection("movies")
            .document(movie.id)
            .set(movie)
            .addOnSuccessListener {
                // Éxito
            }
    }
}
```
- a) Falta el import de FirebaseFirestore
- b) Falta manejar el error
- c) Falta inicializar Firebase
- d) No hay error

---

29. En este código de Firebase Authentication, ¿qué falta?
```kotlin
class AuthRepository {
    private val auth = FirebaseAuth.getInstance()
    
    fun signIn(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                // Login exitoso
            }
    }
}
```
- a) Falta el import de FirebaseAuth
- b) Falta manejar el error
- c) Falta el import de User
- d) No hay error

---

30. En este código de Firebase Storage, ¿qué error hay?
```kotlin
class ImageRepository {
    private val storage = FirebaseStorage.getInstance()
    
    fun uploadImage(imageUri: Uri) {
        val imageRef = storage.reference.child("images/${UUID.randomUUID()}")
        imageRef.putFile(imageUri)
            .addOnSuccessListener {
                // Éxito
            }
    }
}
```
- a) Falta el import de FirebaseStorage
- b) Falta obtener la URL de descarga
- c) Falta manejar el error
- d) No hay error

---

31. En este código de Fragment, ¿qué error hay?
```kotlin
class MovieDetailFragment : Fragment() {
    private var _binding: FragmentMovieDetailBinding? = null
    private val binding get() = _binding!!
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMovieDetailBinding.inflate(inflater, container, false)
        return binding.root
    }
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val movie = arguments?.getSerializable("movie") as Movie
        binding.textViewTitle.text = movie.title
    }
}
```
- a) Falta el import de Fragment
- b) Falta limpiar el binding en onDestroyView
- c) Falta el import de Bundle
- d) No hay error

---

32. En este código de ViewModel con Coroutines, ¿qué falta?
```kotlin
class MovieViewModel : ViewModel() {
    private val _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>> = _movies
    
    fun loadMovies() {
        viewModelScope.launch {
            try {
                val result = withContext(Dispatchers.IO) {
                    movieRepository.getMovies()
                }
                _movies.value = result
            } catch (e: Exception) {
                // Manejar error
            }
        }
    }
}
```
- a) Falta el import de ViewModel
- b) Falta el import de viewModelScope
- c) Falta el import de Dispatchers
- d) No hay error

---

33. En este código de Room Database, ¿qué error hay?
```kotlin
@Dao
interface MovieDao {
    @Query("SELECT * FROM movies WHERE genre = :genre")
    fun getMoviesByGenre(genre: String): List<Movie>
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovie(movie: Movie)
    
    @Delete
    fun deleteMovie(movie: Movie)
}
```
- a) Falta el import de Dao
- b) Falta el import de OnConflictStrategy
- c) Falta el método update
- d) No hay error

---

34. En este código de Navigation Graph, ¿qué falta?
```xml
<navigation xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/nav_graph"
    app:startDestination="@id/movieListFragment">
    
    <fragment
        android:id="@+id/movieListFragment"
        android:name="com.example.app.ui.MovieListFragment"
        android:label="Movies">
        <action
            android:id="@+id/action_movieList_to_detail"
            app:destination="@id/movieDetailFragment" />
    </fragment>
</navigation>
```
- a) Falta el fragment de destino
- b) Falta el argumento para pasar el ID de la película
- c) Falta el import de navigation
- d) No hay error

---

35. En este código de StatefulWidget, ¿qué error hay?
```dart
class MovieListScreen extends StatefulWidget {
  @override
  _MovieListScreenState createState() => _MovieListScreenState();
}

class _MovieListScreenState extends State<MovieListScreen> {
  List<Movie> _movies = [];
  bool _isLoading = false;
  
  @override
  void initState() {
    super.initState();
    _loadMovies();
  }
  
  Future<void> _loadMovies() async {
    setState(() {
      _isLoading = true;
    });
    
    try {
      final movies = await MovieService.getMovies();
      setState(() {
        _movies = movies;
        _isLoading = false;
      });
    } catch (e) {
      setState(() {
        _isLoading = false;
      });
    }
  }
}
```
- a) Falta el método build
- b) Falta el import de material.dart
- c) Falta manejar el error correctamente
- d) No hay error

---

36. En este código de Provider con StreamBuilder, ¿qué falta?
```dart
class MovieProvider extends ChangeNotifier {
  Stream<List<Movie>> getMovies() {
    return FirebaseFirestore.instance
        .collection('movies')
        .snapshots()
        .map((snapshot) {
          return snapshot.docs
              .map((doc) => Movie.fromJson(doc.data()))
              .toList();
        });
  }
}

class MovieListScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return StreamBuilder<List<Movie>>(
      stream: context.read<MovieProvider>().getMovies(),
      builder: (context, snapshot) {
        if (snapshot.hasData) {
          return ListView.builder(
            itemCount: snapshot.data!.length,
            itemBuilder: (context, index) {
              return MovieCard(movie: snapshot.data![index]);
            },
          );
        }
        return CircularProgressIndicator();
      },
    );
  }
}
```
- a) Falta el import de provider
- b) Falta manejar el estado de error
- c) Falta el import de firebase_core
- d) No hay error

---

37. En este código de modelo de datos, ¿qué error hay?
```dart
class Movie {
  final String id;
  final String title;
  final String description;
  final double rating;
  
  Movie({
    required this.id,
    required this.title,
    required this.description,
    required this.rating,
  });
  
  factory Movie.fromJson(Map<String, dynamic> json) {
    return Movie(
      id: json['id'] as String,
      title: json['title'] as String,
      description: json['description'] as String,
      rating: json['rating'] as double,
    );
  }
}
```
- a) Falta el método toJson
- b) Falta el import de json_serializable
- c) Falta el constructor
- d) No hay error

---

38. En este código de Cloud Functions, ¿qué falta?
```javascript
exports.onMovieCreated = functions.firestore
    .document('movies/{movieId}')
    .onCreate((snap, context) => {
        const movie = snap.data();
        const movieId = context.params.movieId;
        
        return admin.firestore()
            .collection('movieStats')
            .doc(movieId)
            .set({
                createdAt: admin.firestore.FieldValue.serverTimestamp(),
                viewCount: 0
            });
    });
```
- a) Falta el import de functions
- b) Falta manejar el error
- c) Falta el import de admin
- d) No hay error

---

39. En este código de Firebase Authentication con Google Sign-In, ¿qué error hay?
```kotlin
class AuthRepository {
    private val auth = FirebaseAuth.getInstance()
    private val googleSignInClient: GoogleSignInClient
    
    init {
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken("your-web-client-id")
            .requestEmail()
            .build()
        googleSignInClient = GoogleSignIn.getClient(context, gso)
    }
    
    fun signInWithGoogle() {
        val signInIntent = googleSignInClient.signInIntent
        activity.startActivityForResult(signInIntent, RC_SIGN_IN)
    }
}
```
- a) Falta el import de GoogleSignIn
- b) Falta manejar el resultado de la actividad
- c) Falta el import de FirebaseAuth
- d) No hay error

---

40. En este código de Firebase Cloud Messaging, ¿qué falta?
```kotlin
class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        
        // Enviar token al servidor
        sendRegistrationToServer(token)
    }
    
    private fun sendRegistrationToServer(token: String) {
        val db = FirebaseFirestore.getInstance()
        db.collection("users")
            .document(getCurrentUserId())
            .update("fcmToken", token)
    }
}
```
- a) Falta el import de FirebaseMessaging
- b) Falta manejar el error
- c) Falta el import de FirebaseFirestore
- d) No hay error

---

41. En este código de RecyclerView con DiffUtil, ¿qué error hay?
```kotlin
class MovieAdapter : ListAdapter<Movie, MovieAdapter.ViewHolder>(MovieDiffCallback()) {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewTitle: TextView = view.findViewById(R.id.textViewTitle)
        val textViewRating: TextView = view.findViewById(R.id.textViewRating)
    }
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        return ViewHolder(view)
    }
    
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = getItem(position)
        holder.textViewTitle.text = movie.title
        holder.textViewRating.text = movie.rating.toString()
    }
}
```
- a) Falta la clase MovieDiffCallback
- b) Falta el import de ListAdapter
- c) Falta el import de DiffUtil
- d) No hay error

---

42. En este código de WorkManager, ¿qué falta?
```kotlin
class MovieSyncWorker(
    context: Context,
    params: WorkerParameters
) : CoroutineWorker(context, params) {
    
    override suspend fun doWork(): Result {
        return try {
            val movies = movieRepository.getMovies()
            movieDao.insertAll(movies)
            Result.success()
        } catch (e: Exception) {
            Result.failure()
        }
    }
}
```
- a) Falta el import de WorkManager
- b) Falta el import de CoroutineWorker
- c) Falta el import de Result
- d) No hay error

---

43. En este código de DataStore, ¿qué error hay?
```kotlin
class UserPreferencesRepository(private val dataStore: DataStore<Preferences>) {
    val userPreferencesFlow: Flow<UserPreferences> = dataStore.data
        .map { preferences ->
            UserPreferences(
                darkMode = preferences[PreferencesKeys.DARK_MODE] ?: false,
                notifications = preferences[PreferencesKeys.NOTIFICATIONS] ?: true
            )
        }
    
    suspend fun updateDarkMode(enabled: Boolean) {
        dataStore.edit { preferences ->
            preferences[PreferencesKeys.DARK_MODE] = enabled
        }
    }
}
```
- a) Falta el import de DataStore
- b) Falta el import de Preferences
- c) Falta el import de Flow
- d) No hay error

---

44. En este código de Hilt, ¿qué falta?
```kotlin
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMovieRepository(
        api: MovieApi,
        db: MovieDatabase
    ): MovieRepository {
        return MovieRepositoryImpl(api, db)
    }
}
```
- a) Falta el import de Module
- b) Falta el import de SingletonComponent
- c) Falta el import de Provides
- d) No hay error

---

45. En este código de GetX, ¿qué error hay?
```dart
class MovieController extends GetxController {
  final _movies = <Movie>[].obs;
  List<Movie> get movies => _movies;
  
  @override
  void onInit() {
    super.onInit();
    loadMovies();
  }
  
  Future<void> loadMovies() async {
    try {
      final result = await MovieService.getMovies();
      _movies.value = result;
    } catch (e) {
      Get.snackbar('Error', 'Failed to load movies');
    }
  }
}
```
- a) Falta el import de get
- b) Falta el import de Movie
- c) Falta el import de GetxController
- d) No hay error

---

46. En este código de Bloc, ¿qué falta?
```dart
class MovieBloc extends Bloc<MovieEvent, MovieState> {
  final MovieRepository repository;
  
  MovieBloc(this.repository) : super(MovieInitial()) {
    on<LoadMovies>(_onLoadMovies);
  }
  
  Future<void> _onLoadMovies(
    LoadMovies event,
    Emitter<MovieState> emit,
  ) async {
    emit(MovieLoading());
    try {
      final movies = await repository.getMovies();
      emit(MovieLoaded(movies));
    } catch (e) {
      emit(MovieError(e.toString()));
    }
  }
}
```
- a) Falta el import de bloc
- b) Falta el import de flutter_bloc
- c) Falta el import de MovieEvent
- d) No hay error

---

47. En este código de Riverpod, ¿qué error hay?
```dart
final movieProvider = StateNotifierProvider<MovieNotifier, AsyncValue<List<Movie>>>((ref) {
  return MovieNotifier(ref.read(movieRepositoryProvider));
});

class MovieNotifier extends StateNotifier<AsyncValue<List<Movie>>> {
  final MovieRepository _repository;
  
  MovieNotifier(this._repository) : super(const AsyncValue.loading()) {
    loadMovies();
  }
  
  Future<void> loadMovies() async {
    state = const AsyncValue.loading();
    try {
      final movies = await _repository.getMovies();
      state = AsyncValue.data(movies);
    } catch (e, stack) {
      state = AsyncValue.error(e, stack);
    }
  }
}
```
- a) Falta el import de flutter_riverpod
- b) Falta el import de AsyncValue
- c) Falta el import de StateNotifier
- d) No hay error

---

48. En este código de Firebase Analytics, ¿qué falta?
```kotlin
class AnalyticsManager {
    private val firebaseAnalytics = FirebaseAnalytics.getInstance(context)
    
    fun logMovieView(movie: Movie) {
        val bundle = Bundle().apply {
            putString(FirebaseAnalytics.Param.ITEM_ID, movie.id)
            putString(FirebaseAnalytics.Param.ITEM_NAME, movie.title)
            putString(FirebaseAnalytics.Param.ITEM_CATEGORY, movie.genre)
        }
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.VIEW_ITEM, bundle)
    }
}
```
- a) Falta el import de FirebaseAnalytics
- b) Falta el import de Bundle
- c) Falta el import de Context
- d) No hay error

---

49. En este código de Firebase Crashlytics, ¿qué error hay?
```kotlin
class CrashlyticsManager {
    private val firebaseCrashlytics = FirebaseCrashlytics.getInstance()
    
    fun logException(e: Exception) {
        firebaseCrashlytics.recordException(e)
    }
    
    fun setUserIdentifier(userId: String) {
        firebaseCrashlytics.setUserId(userId)
    }
}
```
- a) Falta el import de FirebaseCrashlytics
- b) Falta el import de Exception
- c) Falta el import de Context
- d) No hay error

---

50. En este código de Firebase Performance Monitoring, ¿qué falta?
```kotlin
class PerformanceManager {
    private val firebasePerformance = FirebasePerformance.getInstance()
    
    fun startTrace(traceName: String): Trace {
        return firebasePerformance.newTrace(traceName).apply {
            start()
        }
    }
    
    fun stopTrace(trace: Trace) {
        trace.stop()
    }
}
```
- a) Falta el import de FirebasePerformance
- b) Falta el import de Trace
- c) Falta el import de Context
- d) No hay error

---

---

---

## Soluciones Completas

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

21. b) Falta inicializar los TextViews
    ```kotlin
    private lateinit var textViewName: TextView
    private lateinit var textViewEmail: TextView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_user)
        
        textViewName = findViewById(R.id.textViewName)
        textViewEmail = findViewById(R.id.textViewEmail)
        
        val user = intent.getSerializableExtra("user") as User
        textViewName.text = user.name
        textViewEmail.text = user.email
    }
    ```

22. a) Falta el método getItemCount()
    ```kotlin
    override fun getItemCount() = contacts.size
    ```

23. a) Falta el import de Serializable
    ```kotlin
    import java.io.Serializable
    ```

24. a) Falta el import de findNavController
    ```kotlin
    import androidx.navigation.fragment.NavHostFragment.findNavController
    ```

25. b) Falta el constructor
    ```dart
    const UserProfile({Key? key, required this.user}) : super(key: key);
    ```

26. b) Falta manejar el estado de error
    ```dart
    FutureBuilder<List<Movie>>(
      future: _getMovies(),
      builder: (context, snapshot) {
        if (snapshot.hasError) {
          return Text('Error: ${snapshot.error}');
        }
        if (snapshot.hasData) {
          return ListView.builder(
            itemCount: snapshot.data.length,
            itemBuilder: (context, index) {
              return MovieCard(movie: snapshot.data[index]);
            },
          );
        }
        return CircularProgressIndicator();
      },
    )
    ```

27. b) Falta llamar a notifyListeners()
    ```dart
    Future<void> loadMovies() async {
      _movies = await MovieService.getMovies();
      notifyListeners();
    }
    ```

28. b) Falta manejar el error
    ```kotlin
    fun saveMovie(movie: Movie) {
        db.collection("movies")
            .document(movie.id)
            .set(movie)
            .addOnSuccessListener {
                // Éxito
            }
            .addOnFailureListener { e ->
                // Manejar error
            }
    }
    ```

29. b) Falta manejar el error
    ```kotlin
    fun signIn(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                // Login exitoso
            }
            .addOnFailureListener { e ->
                // Manejar error
            }
    }
    ```

30. b) Falta obtener la URL de descarga
    ```kotlin
    fun uploadImage(imageUri: Uri) {
        val imageRef = storage.reference.child("images/${UUID.randomUUID()}")
        imageRef.putFile(imageUri)
            .addOnSuccessListener {
                imageRef.downloadUrl.addOnSuccessListener { uri ->
                    // URL de descarga
                }
            }
            .addOnFailureListener { e ->
                // Manejar error
            }
    }
    ```

31. b) Falta limpiar el binding en onDestroyView
    ```kotlin
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    ```

32. c) Falta el import de Dispatchers
    ```kotlin
    import kotlinx.coroutines.Dispatchers
    ```

33. c) Falta el método update
    ```kotlin
    @Update
    fun updateMovie(movie: Movie)
    ```

34. b) Falta el argumento para pasar el ID de la película
    ```xml
    <fragment
        android:id="@+id/movieDetailFragment"
        android:name="com.example.app.ui.MovieDetailFragment"
        android:label="Movie Detail">
        <argument
            android:name="movieId"
            app:argType="string" />
    </fragment>
    ```

35. a) Falta el método build
    ```dart
    @override
    Widget build(BuildContext context) {
      return Scaffold(
        appBar: AppBar(title: Text('Movies')),
        body: _isLoading
            ? Center(child: CircularProgressIndicator())
            : ListView.builder(
                itemCount: _movies.length,
                itemBuilder: (context, index) {
                  return MovieCard(movie: _movies[index]);
                },
              ),
      );
    }
    ```

36. b) Falta manejar el estado de error
    ```dart
    StreamBuilder<List<Movie>>(
      stream: context.read<MovieProvider>().getMovies(),
      builder: (context, snapshot) {
        if (snapshot.hasError) {
          return Center(child: Text('Error: ${snapshot.error}'));
        }
        if (snapshot.hasData) {
          return ListView.builder(
            itemCount: snapshot.data!.length,
            itemBuilder: (context, index) {
              return MovieCard(movie: snapshot.data![index]);
            },
          );
        }
        return CircularProgressIndicator();
      },
    )
    ```

37. a) Falta el método toJson
    ```dart
    Map<String, dynamic> toJson() {
      return {
        'id': id,
        'title': title,
        'description': description,
        'rating': rating,
      };
    }
    ```

38. b) Falta manejar el error
    ```javascript
    exports.onMovieCreated = functions.firestore
        .document('movies/{movieId}')
        .onCreate((snap, context) => {
            const movie = snap.data();
            const movieId = context.params.movieId;
            
            return admin.firestore()
                .collection('movieStats')
                .doc(movieId)
                .set({
                    createdAt: admin.firestore.FieldValue.serverTimestamp(),
                    viewCount: 0
                })
                .catch(error => {
                    console.error('Error creating movie stats:', error);
                });
        });
    ```

39. b) Falta manejar el resultado de la actividad
    ```kotlin
    fun handleSignInResult(data: Intent?) {
        val task = GoogleSignIn.getSignedInAccountFromIntent(data)
        try {
            val account = task.getResult(ApiException::class.java)
            firebaseAuthWithGoogle(account.idToken!!)
        } catch (e: ApiException) {
            // Manejar error
        }
    }
    
    private fun firebaseAuthWithGoogle(idToken: String) {
        val credential = GoogleAuthProvider.getCredential(idToken, null)
        auth.signInWithCredential(credential)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    // Login exitoso
                } else {
                    // Manejar error
                }
            }
    }
    ```

40. b) Falta manejar el error
    ```kotlin
    private fun sendRegistrationToServer(token: String) {
        val db = FirebaseFirestore.getInstance()
        db.collection("users")
            .document(getCurrentUserId())
            .update("fcmToken", token)
            .addOnSuccessListener {
                // Éxito
            }
            .addOnFailureListener { e ->
                // Manejar error
            }
    }
    ```

41. a) Falta la clase MovieDiffCallback
    ```kotlin
    class MovieDiffCallback : DiffUtil.ItemCallback<Movie>() {
        override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem.id == newItem.id
        }
        
        override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem == newItem
        }
    }
    ```

42. c) Falta el import de Result
    ```kotlin
    import androidx.work.Result
    ```

43. c) Falta el import de Flow
    ```kotlin
    import kotlinx.coroutines.flow.Flow
    import kotlinx.coroutines.flow.map
    ```

44. b) Falta el import de SingletonComponent
    ```kotlin
    import dagger.hilt.components.SingletonComponent
    ```

45. a) Falta el import de get
    ```dart
    import 'package:get/get.dart';
    ```

46. b) Falta el import de flutter_bloc
    ```dart
    import 'package:flutter_bloc/flutter_bloc.dart';
    ```

47. a) Falta el import de flutter_riverpod
    ```dart
    import 'package:flutter_riverpod/flutter_riverpod.dart';
    ```

48. b) Falta el import de Bundle
    ```kotlin
    import android.os.Bundle
    ```

49. a) Falta el import de FirebaseCrashlytics
    ```kotlin
    import com.google.firebase.crashlytics.FirebaseCrashlytics
    ```

50. b) Falta el import de Trace
    ```kotlin
    import com.google.firebase.perf.metrics.Trace
    ```
