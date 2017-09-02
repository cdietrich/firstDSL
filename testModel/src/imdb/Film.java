/**
 */
package imdb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Film</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imdb.Film#getFigures <em>Figures</em>}</li>
 *   <li>{@link imdb.Film#getTitle <em>Title</em>}</li>
 *   <li>{@link imdb.Film#getTitletwo <em>Titletwo</em>}</li>
 *   <li>{@link imdb.Film#getYear <em>Year</em>}</li>
 *   <li>{@link imdb.Film#getLibrary <em>Library</em>}</li>
 *   <li>{@link imdb.Film#getVotes <em>Votes</em>}</li>
 * </ul>
 *
 * @see imdb.ImdbPackage#getFilm()
 * @model
 * @generated
 */
public interface Film extends EObject {
	/**
	 * Returns the value of the '<em><b>Figures</b></em>' containment reference list.
	 * The list contents are of type {@link imdb.Figure}.
	 * It is bidirectional and its opposite is '{@link imdb.Figure#getFilm <em>Film</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figures</em>' containment reference list.
	 * @see imdb.ImdbPackage#getFilm_Figures()
	 * @see imdb.Figure#getFilm
	 * @model opposite="film" containment="true" required="true"
	 * @generated
	 */
	EList<Figure> getFigures();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see imdb.ImdbPackage#getFilm_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link imdb.Film#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Titletwo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titletwo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titletwo</em>' attribute.
	 * @see #setTitletwo(String)
	 * @see imdb.ImdbPackage#getFilm_Titletwo()
	 * @model
	 * @generated
	 */
	String getTitletwo();

	/**
	 * Sets the value of the '{@link imdb.Film#getTitletwo <em>Titletwo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titletwo</em>' attribute.
	 * @see #getTitletwo()
	 * @generated
	 */
	void setTitletwo(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see imdb.ImdbPackage#getFilm_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link imdb.Film#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imdb.IMDB#getFilms <em>Films</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' container reference.
	 * @see #setLibrary(IMDB)
	 * @see imdb.ImdbPackage#getFilm_Library()
	 * @see imdb.IMDB#getFilms
	 * @model opposite="films" transient="false"
	 * @generated
	 */
	IMDB getLibrary();

	/**
	 * Sets the value of the '{@link imdb.Film#getLibrary <em>Library</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' container reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(IMDB value);

	/**
	 * Returns the value of the '<em><b>Votes</b></em>' reference list.
	 * The list contents are of type {@link imdb.Vote}.
	 * It is bidirectional and its opposite is '{@link imdb.Vote#getFilm <em>Film</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Votes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Votes</em>' reference list.
	 * @see imdb.ImdbPackage#getFilm_Votes()
	 * @see imdb.Vote#getFilm
	 * @model opposite="film"
	 * @generated
	 */
	EList<Vote> getVotes();

} // Film
