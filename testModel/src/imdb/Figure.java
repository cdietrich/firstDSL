/**
 */
package imdb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imdb.Figure#getName <em>Name</em>}</li>
 *   <li>{@link imdb.Figure#getFilm <em>Film</em>}</li>
 *   <li>{@link imdb.Figure#getPlayedBy <em>Played By</em>}</li>
 * </ul>
 *
 * @see imdb.ImdbPackage#getFigure()
 * @model
 * @generated
 */
public interface Figure extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see imdb.ImdbPackage#getFigure_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link imdb.Figure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Film</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imdb.Film#getFigures <em>Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Film</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Film</em>' container reference.
	 * @see #setFilm(Film)
	 * @see imdb.ImdbPackage#getFigure_Film()
	 * @see imdb.Film#getFigures
	 * @model opposite="figures" transient="false"
	 * @generated
	 */
	Film getFilm();

	/**
	 * Sets the value of the '{@link imdb.Figure#getFilm <em>Film</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Film</em>' container reference.
	 * @see #getFilm()
	 * @generated
	 */
	void setFilm(Film value);

	/**
	 * Returns the value of the '<em><b>Played By</b></em>' reference list.
	 * The list contents are of type {@link imdb.Actor}.
	 * It is bidirectional and its opposite is '{@link imdb.Actor#getPlays <em>Plays</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Played By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Played By</em>' reference list.
	 * @see imdb.ImdbPackage#getFigure_PlayedBy()
	 * @see imdb.Actor#getPlays
	 * @model opposite="plays" required="true"
	 * @generated
	 */
	EList<Actor> getPlayedBy();

} // Figure
