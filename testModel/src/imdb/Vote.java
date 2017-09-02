/**
 */
package imdb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imdb.Vote#getLibrary <em>Library</em>}</li>
 *   <li>{@link imdb.Vote#getScore <em>Score</em>}</li>
 *   <li>{@link imdb.Vote#getFilm <em>Film</em>}</li>
 *   <li>{@link imdb.Vote#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see imdb.ImdbPackage#getVote()
 * @model
 * @generated
 */
public interface Vote extends EObject {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imdb.IMDB#getVotes <em>Votes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' container reference.
	 * @see #setLibrary(IMDB)
	 * @see imdb.ImdbPackage#getVote_Library()
	 * @see imdb.IMDB#getVotes
	 * @model opposite="votes" required="true" transient="false"
	 * @generated
	 */
	IMDB getLibrary();

	/**
	 * Sets the value of the '{@link imdb.Vote#getLibrary <em>Library</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' container reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(IMDB value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(int)
	 * @see imdb.ImdbPackage#getVote_Score()
	 * @model required="true"
	 * @generated
	 */
	int getScore();

	/**
	 * Sets the value of the '{@link imdb.Vote#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(int value);

	/**
	 * Returns the value of the '<em><b>Film</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link imdb.Film#getVotes <em>Votes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Film</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Film</em>' reference.
	 * @see #setFilm(Film)
	 * @see imdb.ImdbPackage#getVote_Film()
	 * @see imdb.Film#getVotes
	 * @model opposite="votes" required="true"
	 * @generated
	 */
	Film getFilm();

	/**
	 * Sets the value of the '{@link imdb.Vote#getFilm <em>Film</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Film</em>' reference.
	 * @see #getFilm()
	 * @generated
	 */
	void setFilm(Film value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see imdb.ImdbPackage#getVote_User()
	 * @model required="true"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link imdb.Vote#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

} // Vote
