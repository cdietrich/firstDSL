/**
 */
package imdb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imdb.Actor#getLibrary <em>Library</em>}</li>
 *   <li>{@link imdb.Actor#getPlays <em>Plays</em>}</li>
 * </ul>
 *
 * @see imdb.ImdbPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends Person {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imdb.IMDB#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' container reference.
	 * @see #setLibrary(IMDB)
	 * @see imdb.ImdbPackage#getActor_Library()
	 * @see imdb.IMDB#getActors
	 * @model opposite="actors" transient="false"
	 * @generated
	 */
	IMDB getLibrary();

	/**
	 * Sets the value of the '{@link imdb.Actor#getLibrary <em>Library</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' container reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(IMDB value);

	/**
	 * Returns the value of the '<em><b>Plays</b></em>' reference list.
	 * The list contents are of type {@link imdb.Figure}.
	 * It is bidirectional and its opposite is '{@link imdb.Figure#getPlayedBy <em>Played By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plays</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plays</em>' reference list.
	 * @see imdb.ImdbPackage#getActor_Plays()
	 * @see imdb.Figure#getPlayedBy
	 * @model opposite="playedBy"
	 * @generated
	 */
	EList<Figure> getPlays();

} // Actor
