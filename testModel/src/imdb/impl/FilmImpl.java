/**
 */
package imdb.impl;

import imdb.Figure;
import imdb.Film;
import imdb.IMDB;
import imdb.ImdbPackage;
import imdb.Vote;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Film</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imdb.impl.FilmImpl#getFigures <em>Figures</em>}</li>
 *   <li>{@link imdb.impl.FilmImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link imdb.impl.FilmImpl#getTitletwo <em>Titletwo</em>}</li>
 *   <li>{@link imdb.impl.FilmImpl#getYear <em>Year</em>}</li>
 *   <li>{@link imdb.impl.FilmImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link imdb.impl.FilmImpl#getVotes <em>Votes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilmImpl extends MinimalEObjectImpl.Container implements Film {
	/**
	 * The cached value of the '{@link #getFigures() <em>Figures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigures()
	 * @generated
	 * @ordered
	 */
	protected EList<Figure> figures;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitletwo() <em>Titletwo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitletwo()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLETWO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitletwo() <em>Titletwo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitletwo()
	 * @generated
	 * @ordered
	 */
	protected String titletwo = TITLETWO_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVotes() <em>Votes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Vote> votes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImdbPackage.Literals.FILM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Figure> getFigures() {
		if (figures == null) {
			figures = new EObjectContainmentWithInverseEList<Figure>(Figure.class, this, ImdbPackage.FILM__FIGURES, ImdbPackage.FIGURE__FILM);
		}
		return figures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.FILM__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitletwo() {
		return titletwo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitletwo(String newTitletwo) {
		String oldTitletwo = titletwo;
		titletwo = newTitletwo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.FILM__TITLETWO, oldTitletwo, titletwo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.FILM__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMDB getLibrary() {
		if (eContainerFeatureID() != ImdbPackage.FILM__LIBRARY) return null;
		return (IMDB)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrary(IMDB newLibrary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLibrary, ImdbPackage.FILM__LIBRARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(IMDB newLibrary) {
		if (newLibrary != eInternalContainer() || (eContainerFeatureID() != ImdbPackage.FILM__LIBRARY && newLibrary != null)) {
			if (EcoreUtil.isAncestor(this, newLibrary))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLibrary != null)
				msgs = ((InternalEObject)newLibrary).eInverseAdd(this, ImdbPackage.IMDB__FILMS, IMDB.class, msgs);
			msgs = basicSetLibrary(newLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.FILM__LIBRARY, newLibrary, newLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vote> getVotes() {
		if (votes == null) {
			votes = new EObjectWithInverseResolvingEList<Vote>(Vote.class, this, ImdbPackage.FILM__VOTES, ImdbPackage.VOTE__FILM);
		}
		return votes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImdbPackage.FILM__FIGURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFigures()).basicAdd(otherEnd, msgs);
			case ImdbPackage.FILM__LIBRARY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLibrary((IMDB)otherEnd, msgs);
			case ImdbPackage.FILM__VOTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVotes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImdbPackage.FILM__FIGURES:
				return ((InternalEList<?>)getFigures()).basicRemove(otherEnd, msgs);
			case ImdbPackage.FILM__LIBRARY:
				return basicSetLibrary(null, msgs);
			case ImdbPackage.FILM__VOTES:
				return ((InternalEList<?>)getVotes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ImdbPackage.FILM__LIBRARY:
				return eInternalContainer().eInverseRemove(this, ImdbPackage.IMDB__FILMS, IMDB.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImdbPackage.FILM__FIGURES:
				return getFigures();
			case ImdbPackage.FILM__TITLE:
				return getTitle();
			case ImdbPackage.FILM__TITLETWO:
				return getTitletwo();
			case ImdbPackage.FILM__YEAR:
				return getYear();
			case ImdbPackage.FILM__LIBRARY:
				return getLibrary();
			case ImdbPackage.FILM__VOTES:
				return getVotes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImdbPackage.FILM__FIGURES:
				getFigures().clear();
				getFigures().addAll((Collection<? extends Figure>)newValue);
				return;
			case ImdbPackage.FILM__TITLE:
				setTitle((String)newValue);
				return;
			case ImdbPackage.FILM__TITLETWO:
				setTitletwo((String)newValue);
				return;
			case ImdbPackage.FILM__YEAR:
				setYear((Integer)newValue);
				return;
			case ImdbPackage.FILM__LIBRARY:
				setLibrary((IMDB)newValue);
				return;
			case ImdbPackage.FILM__VOTES:
				getVotes().clear();
				getVotes().addAll((Collection<? extends Vote>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImdbPackage.FILM__FIGURES:
				getFigures().clear();
				return;
			case ImdbPackage.FILM__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ImdbPackage.FILM__TITLETWO:
				setTitletwo(TITLETWO_EDEFAULT);
				return;
			case ImdbPackage.FILM__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case ImdbPackage.FILM__LIBRARY:
				setLibrary((IMDB)null);
				return;
			case ImdbPackage.FILM__VOTES:
				getVotes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImdbPackage.FILM__FIGURES:
				return figures != null && !figures.isEmpty();
			case ImdbPackage.FILM__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ImdbPackage.FILM__TITLETWO:
				return TITLETWO_EDEFAULT == null ? titletwo != null : !TITLETWO_EDEFAULT.equals(titletwo);
			case ImdbPackage.FILM__YEAR:
				return year != YEAR_EDEFAULT;
			case ImdbPackage.FILM__LIBRARY:
				return getLibrary() != null;
			case ImdbPackage.FILM__VOTES:
				return votes != null && !votes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", titletwo: ");
		result.append(titletwo);
		result.append(", year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //FilmImpl
