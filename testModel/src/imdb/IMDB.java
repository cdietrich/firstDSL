/**
 */
package imdb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IMDB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imdb.IMDB#getFilms <em>Films</em>}</li>
 *   <li>{@link imdb.IMDB#getActors <em>Actors</em>}</li>
 *   <li>{@link imdb.IMDB#getUsers <em>Users</em>}</li>
 *   <li>{@link imdb.IMDB#getVotes <em>Votes</em>}</li>
 * </ul>
 *
 * @see imdb.ImdbPackage#getIMDB()
 * @model
 * @generated
 */
public interface IMDB extends EObject {
	/**
	 * Returns the value of the '<em><b>Films</b></em>' containment reference list.
	 * The list contents are of type {@link imdb.Film}.
	 * It is bidirectional and its opposite is '{@link imdb.Film#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Films</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Films</em>' containment reference list.
	 * @see imdb.ImdbPackage#getIMDB_Films()
	 * @see imdb.Film#getLibrary
	 * @model opposite="library" containment="true"
	 * @generated
	 */
	EList<Film> getFilms();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link imdb.Actor}.
	 * It is bidirectional and its opposite is '{@link imdb.Actor#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see imdb.ImdbPackage#getIMDB_Actors()
	 * @see imdb.Actor#getLibrary
	 * @model opposite="library" containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link imdb.User}.
	 * It is bidirectional and its opposite is '{@link imdb.User#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see imdb.ImdbPackage#getIMDB_Users()
	 * @see imdb.User#getLibrary
	 * @model opposite="library" containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Votes</b></em>' containment reference list.
	 * The list contents are of type {@link imdb.Vote}.
	 * It is bidirectional and its opposite is '{@link imdb.Vote#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Votes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Votes</em>' containment reference list.
	 * @see imdb.ImdbPackage#getIMDB_Votes()
	 * @see imdb.Vote#getLibrary
	 * @model opposite="library" containment="true"
	 * @generated
	 */
	EList<Vote> getVotes();

} // IMDB
