/**
 */
package imdb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see imdb.ImdbFactory
 * @model kind="package"
 * @generated
 */
public interface ImdbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "imdb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdsd.sdq.ipd.kit.edu/mj#imdb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edu.kit.ipd.sdq.mdsd.mj";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImdbPackage eINSTANCE = imdb.impl.ImdbPackageImpl.init();

	/**
	 * The meta object id for the '{@link imdb.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imdb.impl.PersonImpl
	 * @see imdb.impl.ImdbPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DOB = 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imdb.impl.IMDBImpl <em>IMDB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imdb.impl.IMDBImpl
	 * @see imdb.impl.ImdbPackageImpl#getIMDB()
	 * @generated
	 */
	int IMDB = 1;

	/**
	 * The feature id for the '<em><b>Films</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMDB__FILMS = 0;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMDB__ACTORS = 1;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMDB__USERS = 2;

	/**
	 * The feature id for the '<em><b>Votes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMDB__VOTES = 3;

	/**
	 * The number of structural features of the '<em>IMDB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMDB_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>IMDB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMDB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imdb.impl.FilmImpl <em>Film</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imdb.impl.FilmImpl
	 * @see imdb.impl.ImdbPackageImpl#getFilm()
	 * @generated
	 */
	int FILM = 2;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__FIGURES = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Titletwo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__TITLETWO = 2;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__YEAR = 3;

	/**
	 * The feature id for the '<em><b>Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__LIBRARY = 4;

	/**
	 * The feature id for the '<em><b>Votes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__VOTES = 5;

	/**
	 * The number of structural features of the '<em>Film</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Film</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imdb.impl.FigureImpl <em>Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imdb.impl.FigureImpl
	 * @see imdb.impl.ImdbPackageImpl#getFigure()
	 * @generated
	 */
	int FIGURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Film</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__FILM = 1;

	/**
	 * The feature id for the '<em><b>Played By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE__PLAYED_BY = 2;

	/**
	 * The number of structural features of the '<em>Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imdb.impl.VoteImpl <em>Vote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imdb.impl.VoteImpl
	 * @see imdb.impl.ImdbPackageImpl#getVote()
	 * @generated
	 */
	int VOTE = 4;

	/**
	 * The feature id for the '<em><b>Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTE__LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTE__SCORE = 1;

	/**
	 * The feature id for the '<em><b>Film</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTE__FILM = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTE__USER = 3;

	/**
	 * The number of structural features of the '<em>Vote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Vote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imdb.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imdb.impl.UserImpl
	 * @see imdb.impl.ImdbPackageImpl#getUser()
	 * @generated
	 */
	int USER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Dob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DOB = PERSON__DOB;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_NAME = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LIBRARY = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imdb.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imdb.impl.ActorImpl
	 * @see imdb.impl.ImdbPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Dob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DOB = PERSON__DOB;

	/**
	 * The feature id for the '<em><b>Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__LIBRARY = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plays</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PLAYS = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link imdb.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see imdb.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see imdb.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Person#getDob <em>Dob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dob</em>'.
	 * @see imdb.Person#getDob()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Dob();

	/**
	 * Returns the meta object for class '{@link imdb.IMDB <em>IMDB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IMDB</em>'.
	 * @see imdb.IMDB
	 * @generated
	 */
	EClass getIMDB();

	/**
	 * Returns the meta object for the containment reference list '{@link imdb.IMDB#getFilms <em>Films</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Films</em>'.
	 * @see imdb.IMDB#getFilms()
	 * @see #getIMDB()
	 * @generated
	 */
	EReference getIMDB_Films();

	/**
	 * Returns the meta object for the containment reference list '{@link imdb.IMDB#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see imdb.IMDB#getActors()
	 * @see #getIMDB()
	 * @generated
	 */
	EReference getIMDB_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link imdb.IMDB#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see imdb.IMDB#getUsers()
	 * @see #getIMDB()
	 * @generated
	 */
	EReference getIMDB_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link imdb.IMDB#getVotes <em>Votes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Votes</em>'.
	 * @see imdb.IMDB#getVotes()
	 * @see #getIMDB()
	 * @generated
	 */
	EReference getIMDB_Votes();

	/**
	 * Returns the meta object for class '{@link imdb.Film <em>Film</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Film</em>'.
	 * @see imdb.Film
	 * @generated
	 */
	EClass getFilm();

	/**
	 * Returns the meta object for the containment reference list '{@link imdb.Film#getFigures <em>Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Figures</em>'.
	 * @see imdb.Film#getFigures()
	 * @see #getFilm()
	 * @generated
	 */
	EReference getFilm_Figures();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Film#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see imdb.Film#getTitle()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_Title();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Film#getTitletwo <em>Titletwo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titletwo</em>'.
	 * @see imdb.Film#getTitletwo()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_Titletwo();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Film#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see imdb.Film#getYear()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_Year();

	/**
	 * Returns the meta object for the container reference '{@link imdb.Film#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Library</em>'.
	 * @see imdb.Film#getLibrary()
	 * @see #getFilm()
	 * @generated
	 */
	EReference getFilm_Library();

	/**
	 * Returns the meta object for the reference list '{@link imdb.Film#getVotes <em>Votes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Votes</em>'.
	 * @see imdb.Film#getVotes()
	 * @see #getFilm()
	 * @generated
	 */
	EReference getFilm_Votes();

	/**
	 * Returns the meta object for class '{@link imdb.Figure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure</em>'.
	 * @see imdb.Figure
	 * @generated
	 */
	EClass getFigure();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Figure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see imdb.Figure#getName()
	 * @see #getFigure()
	 * @generated
	 */
	EAttribute getFigure_Name();

	/**
	 * Returns the meta object for the container reference '{@link imdb.Figure#getFilm <em>Film</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Film</em>'.
	 * @see imdb.Figure#getFilm()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_Film();

	/**
	 * Returns the meta object for the reference list '{@link imdb.Figure#getPlayedBy <em>Played By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Played By</em>'.
	 * @see imdb.Figure#getPlayedBy()
	 * @see #getFigure()
	 * @generated
	 */
	EReference getFigure_PlayedBy();

	/**
	 * Returns the meta object for class '{@link imdb.Vote <em>Vote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vote</em>'.
	 * @see imdb.Vote
	 * @generated
	 */
	EClass getVote();

	/**
	 * Returns the meta object for the container reference '{@link imdb.Vote#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Library</em>'.
	 * @see imdb.Vote#getLibrary()
	 * @see #getVote()
	 * @generated
	 */
	EReference getVote_Library();

	/**
	 * Returns the meta object for the attribute '{@link imdb.Vote#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see imdb.Vote#getScore()
	 * @see #getVote()
	 * @generated
	 */
	EAttribute getVote_Score();

	/**
	 * Returns the meta object for the reference '{@link imdb.Vote#getFilm <em>Film</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Film</em>'.
	 * @see imdb.Vote#getFilm()
	 * @see #getVote()
	 * @generated
	 */
	EReference getVote_Film();

	/**
	 * Returns the meta object for the reference '{@link imdb.Vote#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see imdb.Vote#getUser()
	 * @see #getVote()
	 * @generated
	 */
	EReference getVote_User();

	/**
	 * Returns the meta object for class '{@link imdb.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see imdb.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link imdb.User#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see imdb.User#getUserName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserName();

	/**
	 * Returns the meta object for the attribute '{@link imdb.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see imdb.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the container reference '{@link imdb.User#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Library</em>'.
	 * @see imdb.User#getLibrary()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Library();

	/**
	 * Returns the meta object for class '{@link imdb.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see imdb.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the container reference '{@link imdb.Actor#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Library</em>'.
	 * @see imdb.Actor#getLibrary()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Library();

	/**
	 * Returns the meta object for the reference list '{@link imdb.Actor#getPlays <em>Plays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plays</em>'.
	 * @see imdb.Actor#getPlays()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Plays();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImdbFactory getImdbFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link imdb.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imdb.impl.PersonImpl
		 * @see imdb.impl.ImdbPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Dob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DOB = eINSTANCE.getPerson_Dob();

		/**
		 * The meta object literal for the '{@link imdb.impl.IMDBImpl <em>IMDB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imdb.impl.IMDBImpl
		 * @see imdb.impl.ImdbPackageImpl#getIMDB()
		 * @generated
		 */
		EClass IMDB = eINSTANCE.getIMDB();

		/**
		 * The meta object literal for the '<em><b>Films</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMDB__FILMS = eINSTANCE.getIMDB_Films();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMDB__ACTORS = eINSTANCE.getIMDB_Actors();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMDB__USERS = eINSTANCE.getIMDB_Users();

		/**
		 * The meta object literal for the '<em><b>Votes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMDB__VOTES = eINSTANCE.getIMDB_Votes();

		/**
		 * The meta object literal for the '{@link imdb.impl.FilmImpl <em>Film</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imdb.impl.FilmImpl
		 * @see imdb.impl.ImdbPackageImpl#getFilm()
		 * @generated
		 */
		EClass FILM = eINSTANCE.getFilm();

		/**
		 * The meta object literal for the '<em><b>Figures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILM__FIGURES = eINSTANCE.getFilm_Figures();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILM__TITLE = eINSTANCE.getFilm_Title();

		/**
		 * The meta object literal for the '<em><b>Titletwo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILM__TITLETWO = eINSTANCE.getFilm_Titletwo();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILM__YEAR = eINSTANCE.getFilm_Year();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILM__LIBRARY = eINSTANCE.getFilm_Library();

		/**
		 * The meta object literal for the '<em><b>Votes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILM__VOTES = eINSTANCE.getFilm_Votes();

		/**
		 * The meta object literal for the '{@link imdb.impl.FigureImpl <em>Figure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imdb.impl.FigureImpl
		 * @see imdb.impl.ImdbPackageImpl#getFigure()
		 * @generated
		 */
		EClass FIGURE = eINSTANCE.getFigure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE__NAME = eINSTANCE.getFigure_Name();

		/**
		 * The meta object literal for the '<em><b>Film</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__FILM = eINSTANCE.getFigure_Film();

		/**
		 * The meta object literal for the '<em><b>Played By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE__PLAYED_BY = eINSTANCE.getFigure_PlayedBy();

		/**
		 * The meta object literal for the '{@link imdb.impl.VoteImpl <em>Vote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imdb.impl.VoteImpl
		 * @see imdb.impl.ImdbPackageImpl#getVote()
		 * @generated
		 */
		EClass VOTE = eINSTANCE.getVote();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOTE__LIBRARY = eINSTANCE.getVote_Library();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOTE__SCORE = eINSTANCE.getVote_Score();

		/**
		 * The meta object literal for the '<em><b>Film</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOTE__FILM = eINSTANCE.getVote_Film();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOTE__USER = eINSTANCE.getVote_User();

		/**
		 * The meta object literal for the '{@link imdb.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imdb.impl.UserImpl
		 * @see imdb.impl.ImdbPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_NAME = eINSTANCE.getUser_UserName();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__LIBRARY = eINSTANCE.getUser_Library();

		/**
		 * The meta object literal for the '{@link imdb.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imdb.impl.ActorImpl
		 * @see imdb.impl.ImdbPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__LIBRARY = eINSTANCE.getActor_Library();

		/**
		 * The meta object literal for the '<em><b>Plays</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__PLAYS = eINSTANCE.getActor_Plays();

	}

} //ImdbPackage
