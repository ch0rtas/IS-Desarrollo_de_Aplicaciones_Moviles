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
- a) Falta el import de FirebaseFirestore
- b) Falta manejar el error
- c) Falta inicializar Firebase
- d) No hay error

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
- a) Falta el import de FirebaseStorage
- b) Falta manejar el error
- c) Falta obtener la URL de descarga
- d) No hay error

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
- a) Falta el import de NavController
- b) Falta el import de NavHostFragment
- c) Falta inicializar el NavController
- d) No hay error

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
- a) Falta el import de ViewModel
- b) Falta el import de LiveData
- c) Falta el import de viewModelScope
- d) No hay error

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
- a) Falta el import de StreamBuilder
- b) Falta manejar el estado de error
- c) Falta manejar el estado de carga
- d) No hay error

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
- a) Falta el método build
- b) Falta el import de material.dart
- c) Falta el constructor
- d) No hay error

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
- a) Falta el import de FirebaseAuth
- b) FirebaseUser está deprecado
- c) Falta manejar el error de signOut
- d) No hay error

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
- a) Falta el import de FirebaseDatabase
- b) Falta manejar el error
- c) Falta establecer las reglas de seguridad
- d) No hay error

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
- a) Falta el import de CoroutineScope
- b) Falta cancelar el scope en onDestroy
- c) Falta manejar excepciones
- d) No hay error

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
- a) Falta el import de Dao
- b) Falta el import de Query
- c) Falta el método delete
- d) No hay error

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
- a) Falta el import de FutureBuilder
- b) Falta manejar el estado de error
- c) Falta el import de CircularProgressIndicator
- d) No hay error

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
- a) Falta el import de provider
- b) Falta llamar a notifyListeners()
- c) Falta el constructor
- d) No hay error

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
- a) Falta el import de functions
- b) Falta el import de admin
- c) Falta manejar el error
- d) No hay error

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
- a) Falta el import de FirebaseMessagingService
- b) Falta crear el canal de notificación
- c) Falta el import de RemoteMessage
- d) No hay error

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
- b) Falta el import de admin
- c) Falta manejar el error
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

49. En este código de Firebase Crashlytics, ¿qué falta?
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

51. ¿Qué es el ciclo de vida de una Activity en Android y cuáles son sus principales métodos?
- a) onCreate(), onStart(), onResume(), onPause(), onStop(), onDestroy()
- b) initState(), build(), dispose()
- c) viewDidLoad(), viewWillAppear(), viewDidAppear()
- d) Ninguna de las anteriores

---

52. ¿Cuál es la diferencia entre StatefulWidget y StatelessWidget en Flutter?
- a) StatefulWidget mantiene estado mutable mientras que StatelessWidget es inmutable
- b) StatefulWidget es más rápido que StatelessWidget
- c) StatelessWidget puede tener animaciones mientras que StatefulWidget no
- d) No hay diferencia significativa

---

53. ¿Qué es el patrón Repository y cuál es su propósito principal?
- a) Es un patrón que solo se usa para bases de datos
- b) Es un patrón que abstrae la fuente de datos y centraliza la lógica de acceso a datos
- c) Es un patrón que solo se usa para APIs REST
- d) Es un patrón que solo se usa para Firebase

---

54. ¿Cuál es la diferencia entre LiveData y Flow en Android?
- a) LiveData es solo para UI mientras que Flow es para operaciones asíncronas
- b) Flow es más antiguo que LiveData
- c) LiveData puede emitir múltiples valores mientras que Flow solo uno
- d) No hay diferencia significativa

---

55. ¿Qué es el patrón BLoC (Business Logic Component) y cuándo se debe usar?
- a) Es un patrón que solo se usa para UI
- b) Es un patrón que separa la lógica de negocio de la UI y maneja el estado de la aplicación
- c) Es un patrón que solo se usa para bases de datos
- d) Es un patrón que solo se usa para APIs

---

56. ¿Cuál es la diferencia entre SharedPreferences y DataStore en Android?
- a) DataStore es más antiguo que SharedPreferences
- b) SharedPreferences es asíncrono mientras que DataStore es síncrono
- c) DataStore es más moderno, tipo-seguro y asíncrono, mientras que SharedPreferences es síncrono y menos seguro
- d) No hay diferencia significativa

---

57. ¿Qué es la inyección de dependencias y cuáles son sus beneficios?
- a) Es una técnica que solo se usa para testing
- b) Es una técnica que permite pasar dependencias a una clase desde fuera, mejorando la testabilidad y mantenibilidad
- c) Es una técnica que solo se usa para bases de datos
- d) Es una técnica que solo se usa para APIs

---

58. ¿Cuál es la diferencia entre Coroutines y RxJava en Android?
- a) Coroutines es más antiguo que RxJava
- b) RxJava es más simple que Coroutines
- c) Coroutines es más ligero y tiene una sintaxis más simple, mientras que RxJava es más potente pero más complejo
- d) No hay diferencia significativa

---

59. ¿Qué es el patrón MVVM (Model-View-ViewModel) y cuáles son sus componentes principales?
- a) Es un patrón que solo se usa para UI
- b) Es un patrón que separa la lógica de negocio (Model), la UI (View) y el estado (ViewModel)
- c) Es un patrón que solo se usa para bases de datos
- d) Es un patrón que solo se usa para APIs

---

60. ¿Cuál es la diferencia entre Navigator 1.0 y Navigator 2.0 en Flutter?
- a) Navigator 2.0 es más antiguo que Navigator 1.0
- b) Navigator 1.0 es más potente que Navigator 2.0
- c) Navigator 2.0 ofrece más control sobre la navegación y el estado de la ruta, mientras que Navigator 1.0 es más simple
- d) No hay diferencia significativa

---

61. ¿Qué es el patrón Clean Architecture y cuáles son sus capas principales?
- a) Es un patrón que solo se usa para UI
- b) Es un patrón que separa la aplicación en capas (presentación, dominio, datos) para mejorar la mantenibilidad
- c) Es un patrón que solo se usa para bases de datos
- d) Es un patrón que solo se usa para APIs

---

62. ¿Cuál es la diferencia entre State Management y State Management en Flutter?
- a) No hay diferencia, son lo mismo
- b) State Management es para Android mientras que State Management es para Flutter
- c) State Management se refiere a cómo manejar el estado de la aplicación, mientras que State Management es un patrón específico
- d) Ninguna de las anteriores

---

63. ¿Qué es el patrón Observer y cómo se implementa en Android/Flutter?
- a) Es un patrón que solo se usa para UI
- b) Es un patrón que permite a objetos suscribirse a cambios en otro objeto (como LiveData, Stream, etc.)
- c) Es un patrón que solo se usa para bases de datos
- d) Es un patrón que solo se usa para APIs

---

64. ¿Cuál es la diferencia entre WorkManager y JobScheduler en Android?
- a) WorkManager es más antiguo que JobScheduler
- b) JobScheduler es más potente que WorkManager
- c) WorkManager es una API unificada que usa JobScheduler internamente en Android 6.0+
- d) No hay diferencia significativa

---

65. ¿Qué es el patrón Singleton y cuándo se debe usar?
- a) Es un patrón que solo se usa para UI
- b) Es un patrón que asegura que una clase tenga una única instancia y proporciona un punto de acceso global
- c) Es un patrón que solo se usa para bases de datos
- d) Es un patrón que solo se usa para APIs

---

66. ¿Cuál es la diferencia entre Firebase Authentication y Firebase Auth en Flutter?
- a) Firebase Authentication es más antiguo que Firebase Auth
- b) Firebase Auth es más potente que Firebase Authentication
- c) Son el mismo servicio, solo que Firebase Auth es el nombre en Flutter
- d) No hay diferencia significativa

---

67. ¿Qué es el patrón Factory y cuándo se debe usar?
- a) Es un patrón que solo se usa para UI
- b) Es un patrón que proporciona una interfaz para crear objetos sin especificar su clase concreta
- c) Es un patrón que solo se usa para bases de datos
- d) Es un patrón que solo se usa para APIs

---

68. ¿Cuál es la diferencia entre Room y SQLite en Android?
- a) Room es más antiguo que SQLite
- b) SQLite es más potente que Room
- c) Room es una capa de abstracción sobre SQLite que proporciona verificación en tiempo de compilación y mapeo objeto-relacional
- d) No hay diferencia significativa

---

69. ¿Qué es el patrón Adapter y cuándo se debe usar?
- a) Es un patrón que solo se usa para UI
- b) Es un patrón que permite la colaboración entre clases con interfaces incompatibles
- c) Es un patrón que solo se usa para bases de datos
- d) Es un patrón que solo se usa para APIs

---

70. ¿Cuál es la diferencia entre Provider y GetX en Flutter?
- a) Provider es más antiguo que GetX
- b) GetX es más simple que Provider
- c) Provider es más ligero y simple, mientras que GetX es más completo pero más complejo
- d) No hay diferencia significativa

---

71. ¿Cuál es la diferencia entre `val` y `var` en Kotlin?
- a) `val` es para variables mutables y `var` para inmutables
- b) `val` es para variables inmutables y `var` para mutables
- c) `val` es para constantes y `var` para variables temporales
- d) No hay diferencia significativa

---

72. ¿Qué es una función de extensión en Kotlin y cuál es su propósito?
- a) Es una función que solo puede ser llamada desde una clase específica
- b) Es una función que extiende la funcionalidad de una clase sin modificar su código fuente
- c) Es una función que solo puede ser usada en proyectos grandes
- d) Es una función que solo puede ser usada en Android

---

73. ¿Cuál es la diferencia entre `lateinit` y `by lazy` en Kotlin?
- a) `lateinit` es para propiedades mutables y `by lazy` para inmutables
- b) `lateinit` es para propiedades inmutables y `by lazy` para mutables
- c) `lateinit` es para inicialización tardía de propiedades no-nulas, mientras que `by lazy` es para propiedades computadas
- d) No hay diferencia significativa

---

74. ¿Qué son las corrutinas en Kotlin y cuál es su ventaja principal?
- a) Son hilos ligeros que permiten programación asíncrona sin bloqueo
- b) Son funciones que solo pueden ser usadas en Android
- c) Son funciones que solo pueden ser usadas en proyectos grandes
- d) Son funciones que solo pueden ser usadas en bases de datos

---

75. ¿Cuál es la diferencia entre `apply`, `let`, `run`, `with` y `also` en Kotlin?
- a) Son funciones de extensión que permiten diferentes formas de trabajar con objetos
- b) Son funciones que solo pueden ser usadas en Android
- c) Son funciones que solo pueden ser usadas en proyectos grandes
- d) No hay diferencia significativa

---

76. ¿Qué es un data class en Kotlin y cuáles son sus características principales?
- a) Es una clase que solo puede contener datos primitivos
- b) Es una clase que automáticamente implementa equals(), hashCode(), toString() y copy()
- c) Es una clase que solo puede ser usada en bases de datos
- d) Es una clase que solo puede ser usada en Android

---

77. ¿Cuál es la diferencia entre `object` y `class` en Kotlin?
- a) `object` es para clases estáticas y `class` para instanciables
- b) `object` es para clases instanciables y `class` para estáticas
- c) `object` es para clases que solo pueden ser usadas en Android
- d) No hay diferencia significativa

---

78. ¿Qué son las funciones de orden superior en Kotlin y cuál es su propósito?
- a) Son funciones que solo pueden ser usadas en Android
- b) Son funciones que toman otras funciones como parámetros o retornan funciones
- c) Son funciones que solo pueden ser usadas en proyectos grandes
- d) Son funciones que solo pueden ser usadas en bases de datos

---

79. ¿Cuál es la diferencia entre `init` y `constructor` en Kotlin?
- a) `init` es para inicialización de propiedades y `constructor` para crear instancias
- b) `init` es para crear instancias y `constructor` para inicialización de propiedades
- c) `init` es para clases que solo pueden ser usadas en Android
- d) No hay diferencia significativa

---

80. ¿Qué es la delegación de propiedades en Kotlin y cuándo se debe usar?
- a) Es un mecanismo que permite delegar la implementación de propiedades a otra clase
- b) Es un mecanismo que solo puede ser usado en Android
- c) Es un mecanismo que solo puede ser usado en proyectos grandes
- d) Es un mecanismo que solo puede ser usado en bases de datos

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

19. b) Falta manejar el error
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

51. a) onCreate(), onStart(), onResume(), onPause(), onStop(), onDestroy()
    ```kotlin
    // Estos son los métodos principales del ciclo de vida de una Activity
    override fun onCreate(savedInstanceState: Bundle?) { ... }
    override fun onStart() { ... }
    override fun onResume() { ... }
    override fun onPause() { ... }
    override fun onStop() { ... }
    override fun onDestroy() { ... }
    ```

52. a) StatefulWidget mantiene estado mutable mientras que StatelessWidget es inmutable
    ```dart
    // StatefulWidget
    class MyStatefulWidget extends StatefulWidget {
      @override
      _MyStatefulWidgetState createState() => _MyStatefulWidgetState();
    }

    // StatelessWidget
    class MyStatelessWidget extends StatelessWidget {
      @override
      Widget build(BuildContext context) { ... }
    }
    ```

53. b) Es un patrón que abstrae la fuente de datos y centraliza la lógica de acceso a datos
    ```kotlin
    class UserRepository(private val userDao: UserDao, private val api: UserApi) {
        fun getUser(id: String): Flow<User> {
            return flow {
                // Primero emitir datos locales
                emit(userDao.getUser(id))
                // Luego actualizar desde la red
                val user = api.getUser(id)
                userDao.insert(user)
                emit(user)
            }
        }
    }
    ```

54. a) LiveData es solo para UI mientras que Flow es para operaciones asíncronas
    ```kotlin
    // LiveData - solo para UI
    val userLiveData: LiveData<User> = userDao.getUser()

    // Flow - para operaciones asíncronas
    val userFlow: Flow<User> = flow {
        emit(userDao.getUser())
        val user = api.getUser()
        emit(user)
    }
    ```

55. b) Es un patrón que separa la lógica de negocio de la UI y maneja el estado de la aplicación
    ```dart
    class CounterBloc extends Bloc<CounterEvent, CounterState> {
        CounterBloc() : super(CounterInitial()) {
            on<IncrementEvent>((event, emit) {
                emit(CounterState(counter: state.counter + 1));
            });
        }
    }
    ```

56. c) DataStore es más moderno, tipo-seguro y asíncrono, mientras que SharedPreferences es síncrono y menos seguro
    ```kotlin
    // DataStore
    val dataStore = context.createDataStore(name = "settings")
    dataStore.edit { preferences ->
        preferences[PreferencesKeys.DARK_MODE] = true
    }

    // SharedPreferences
    val prefs = context.getSharedPreferences("settings", Context.MODE_PRIVATE)
    prefs.edit().putBoolean("dark_mode", true).apply()
    ```

57. b) Es una técnica que permite pasar dependencias a una clase desde fuera, mejorando la testabilidad y mantenibilidad
    ```kotlin
    @Module
    @InstallIn(SingletonComponent::class)
    object AppModule {
        @Provides
        @Singleton
        fun provideUserRepository(
            userDao: UserDao,
            userApi: UserApi
        ): UserRepository {
            return UserRepositoryImpl(userDao, userApi)
        }
    }
    ```

58. c) Coroutines es más ligero y tiene una sintaxis más simple, mientras que RxJava es más potente pero más complejo
    ```kotlin
    // Coroutines
    viewModelScope.launch {
        val result = withContext(Dispatchers.IO) {
            repository.getData()
        }
        _data.value = result
    }

    // RxJava
    repository.getData()
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe { result ->
            _data.value = result
        }
    ```

59. b) Es un patrón que separa la lógica de negocio (Model), la UI (View) y el estado (ViewModel)
    ```kotlin
    // Model
    data class User(val id: String, val name: String)

    // ViewModel
    class UserViewModel : ViewModel() {
        private val _user = MutableLiveData<User>()
        val user: LiveData<User> = _user
    }

    // View
    class UserActivity : AppCompatActivity() {
        private val viewModel: UserViewModel by viewModels()
    }
    ```

60. c) Navigator 2.0 ofrece más control sobre la navegación y el estado de la ruta, mientras que Navigator 1.0 es más simple
    ```dart
    // Navigator 1.0
    Navigator.push(context, MaterialPageRoute(builder: (context) => SecondScreen()));

    // Navigator 2.0
    class RouterDelegate extends RouterDelegate<PageConfiguration> {
        @override
        Widget build(BuildContext context) {
            return Navigator(
                pages: _pages,
                onPopPage: (route, result) {
                    if (!route.didPop(result)) return false;
                    _pages.removeLast();
                    notifyListeners();
                    return true;
                },
            );
        }
    }
    ```

61. b) Es un patrón que separa la aplicación en capas (presentación, dominio, datos) para mejorar la mantenibilidad
    ```kotlin
    // Presentación
    class UserViewModel : ViewModel() { ... }

    // Dominio
    class GetUserUseCase @Inject constructor(
        private val userRepository: UserRepository
    ) { ... }

    // Datos
    class UserRepositoryImpl @Inject constructor(
        private val userDao: UserDao,
        private val userApi: UserApi
    ) : UserRepository { ... }
    ```

62. c) State Management se refiere a cómo manejar el estado de la aplicación, mientras que State Management es un patrón específico
    ```dart
    // State Management general
    class Counter extends StatefulWidget {
        @override
        _CounterState createState() => _CounterState();
    }

    // Patrón específico (Provider)
    class CounterProvider extends ChangeNotifier {
        int _count = 0;
        int get count => _count;
        void increment() {
            _count++;
            notifyListeners();
        }
    }
    ```

63. b) Es un patrón que permite a objetos suscribirse a cambios en otro objeto (como LiveData, Stream, etc.)
    ```kotlin
    // Android
    val userLiveData = MutableLiveData<User>()
    userLiveData.observe(this) { user ->
        updateUI(user)
    }

    // Flutter
    StreamBuilder<User>(
        stream: userStream,
        builder: (context, snapshot) {
            return Text(snapshot.data?.name ?? '');
        },
    )
    ```

64. c) WorkManager es una API unificada que usa JobScheduler internamente en Android 6.0+
    ```kotlin
    val workRequest = OneTimeWorkRequestBuilder<MyWorker>()
        .setConstraints(
            Constraints.Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build()
        )
        .build()
    WorkManager.getInstance(context).enqueue(workRequest)
    ```

65. b) Es un patrón que asegura que una clase tenga una única instancia y proporciona un punto de acceso global
    ```kotlin
    object DatabaseManager {
        private var instance: Database? = null
        
        fun getInstance(context: Context): Database {
            return instance ?: synchronized(this) {
                instance ?: createDatabase(context).also { instance = it }
            }
        }
    }
    ```

66. c) Son el mismo servicio, solo que Firebase Auth es el nombre en Flutter
    ```dart
    // Flutter
    final FirebaseAuth auth = FirebaseAuth.instance;
    await auth.signInWithEmailAndPassword(
        email: email,
        password: password
    );

    // Android
    val auth = FirebaseAuth.getInstance()
    auth.signInWithEmailAndPassword(email, password)
    ```

67. b) Es un patrón que proporciona una interfaz para crear objetos sin especificar su clase concreta
    ```kotlin
    interface Animal
    class Dog : Animal
    class Cat : Animal

    class AnimalFactory {
        fun createAnimal(type: String): Animal {
            return when (type) {
                "dog" -> Dog()
                "cat" -> Cat()
                else -> throw IllegalArgumentException()
            }
        }
    }
    ```

68. c) Room es una capa de abstracción sobre SQLite que proporciona verificación en tiempo de compilación y mapeo objeto-relacional
    ```kotlin
    @Entity
    data class User(
        @PrimaryKey val id: Int,
        val name: String
    )

    @Dao
    interface UserDao {
        @Query("SELECT * FROM user")
        fun getAll(): List<User>
    }
    ```

69. b) Es un patrón que permite la colaboración entre clases con interfaces incompatibles
    ```kotlin
    interface Target {
        fun request()
    }

    class Adaptee {
        fun specificRequest() { ... }
    }

    class Adapter(private val adaptee: Adaptee) : Target {
        override fun request() {
            adaptee.specificRequest()
        }
    }
    ```

70. c) Provider es más ligero y simple, mientras que GetX es más completo pero más complejo
    ```dart
    // Provider
    class CounterProvider extends ChangeNotifier {
        int _count = 0;
        int get count => _count;
        void increment() {
            _count++;
            notifyListeners();
        }
    }

    // GetX
    class CounterController extends GetxController {
        var count = 0.obs;
        void increment() => count++;
    }
    ```

71. b) `val` es para variables inmutables y `var` para mutables
    ```kotlin
    // val - inmutable (no se puede reasignar)
    val name = "John"
    // name = "Jane" // Error: Val cannot be reassigned

    // var - mutable (se puede reasignar)
    var age = 25
    age = 26 // OK
    ```

72. b) Es una función que extiende la funcionalidad de una clase sin modificar su código fuente
    ```kotlin
    // Función de extensión para String
    fun String.addHello(): String {
        return "Hello $this"
    }

    // Uso
    val name = "John"
    println(name.addHello()) // Imprime: Hello John
    ```

73. c) `lateinit` es para inicialización tardía de propiedades no-nulas, mientras que `by lazy` es para propiedades computadas
    ```kotlin
    class MyClass {
        // lateinit - para propiedades que se inicializarán después
        lateinit var name: String
        
        // by lazy - para propiedades computadas que se inicializan en su primer uso
        val expensiveComputation by lazy {
            // Cálculo costoso que solo se ejecuta una vez
            "Resultado"
        }
    }
    ```

74. a) Son hilos ligeros que permiten programación asíncrona sin bloqueo
    ```kotlin
    // Ejemplo de corrutina
    fun main() = runBlocking {
        launch {
            // Operación asíncrona
            val result = async {
                // Cálculo en segundo plano
                "Resultado"
            }.await()
            println(result)
        }
    }
    ```

75. a) Son funciones de extensión que permiten diferentes formas de trabajar con objetos
    ```kotlin
    val person = Person("John", 25)

    // apply - configura el objeto y retorna el objeto
    person.apply {
        name = "Jane"
        age = 26
    }

    // let - ejecuta código y retorna el resultado
    val nameLength = person.let { it.name.length }

    // run - similar a let pero con this
    val ageInDays = person.run { age * 365 }

    // with - similar a run pero como función
    with(person) {
        println(name)
        println(age)
    }

    // also - ejecuta código y retorna el objeto
    person.also { println("Created: ${it.name}") }
    ```

76. b) Es una clase que automáticamente implementa equals(), hashCode(), toString() y copy()
    ```kotlin
    data class User(
        val id: Int,
        val name: String,
        val email: String
    )

    // Uso automático de funciones generadas
    val user1 = User(1, "John", "john@email.com")
    val user2 = user1.copy(name = "Jane") // Crea una copia con nombre modificado
    println(user1 == user2) // Compara usando equals()
    println(user1) // Usa toString()
    ```

77. a) `object` es para clases estáticas y `class` para instanciables
    ```kotlin
    // object - singleton
    object DatabaseManager {
        fun connect() { ... }
    }
    // Uso
    DatabaseManager.connect()

    // class - instanciable
    class User(val name: String)
    // Uso
    val user = User("John")
    ```

78. b) Son funciones que toman otras funciones como parámetros o retornan funciones
    ```kotlin
    // Función que toma otra función como parámetro
    fun executeOperation(operation: (Int, Int) -> Int) {
        val result = operation(5, 3)
        println(result)
    }

    // Uso
    executeOperation { a, b -> a + b } // Suma
    executeOperation { a, b -> a * b } // Multiplicación
    ```

79. a) `init` es para inicialización de propiedades y `constructor` para crear instancias
    ```kotlin
    class Person(val name: String) {
        // Constructor primario
        init {
            // Inicialización de propiedades
            println("Inicializando Person")
        }

        // Constructor secundario
        constructor(name: String, age: Int) : this(name) {
            println("Constructor secundario con edad: $age")
        }
    }
    ```

80. a) Es un mecanismo que permite delegar la implementación de propiedades a otra clase
    ```kotlin
    // Delegación de propiedad
    class Delegate {
        private var value: String = ""
        
        operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
            return value
        }
        
        operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: String) {
            value = newValue
        }
    }

    class Example {
        var name: String by Delegate()
    }

    // Uso
    val example = Example()
    example.name = "John" // Usa setValue
    println(example.name) // Usa getValue
    ```
