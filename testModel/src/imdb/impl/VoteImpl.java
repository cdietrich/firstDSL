/**
 */
package imdb.impl;

import imdb.Film;
import imdb.IMDB;
import imdb.ImdbPackage;
import imdb.User;
import imdb.Vote;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imdb.impl.VoteImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link imdb.impl.VoteImpl#getScore <em>Score</em>}</li>
 *   <li>{@link imdb.impl.VoteImpl#getFilm <em>Film</em>}</li>
 *   <li>{@link imdb.impl.VoteImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VoteImpl extends MinimalEObjectImpl.Container implements Vote {
	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final int SCORE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected int score = SCORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilm() <em>Film</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilm()
	 * @generated
	 * @ordered
	 */
	protected Film film;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImdbPackage.Literals.VOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMDB getLibrary() {
		if (eContainerFeatureID() != ImdbPackage.VOTE__LIBRARY) return null;
		return (IMDB)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrary(IMDB newLibrary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLibrary, ImdbPackage.VOTE__LIBRARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(IMDB newLibrary) {
		if (newLibrary != eInternalContainer() || (eContainerFeatureID() != ImdbPackage.VOTE__LIBRARY && newLibrary != null)) {
			if (EcoreUtil.isAncestor(this, newLibrary))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLibrary != null)
				msgs = ((InternalEObject)newLibrary).eInverseAdd(this, ImdbPackage.IMDB__VOTES, IMDB.class, msgs);
			msgs = basicSetLibrary(newLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.VOTE__LIBRARY, newLibrary, newLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(int newScore) {
		int oldScore = score;
		score = newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.VOTE__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Film getFilm() {
		if (film != null && film.eIsProxy()) {
			InternalEObject oldFilm = (InternalEObject)film;
			film = (Film)eResolveProxy(oldFilm);
			if (film != oldFilm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImdbPackage.VOTE__FILM, oldFilm, film));
			}
		}
		return film;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Film basicGetFilm() {
		return film;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilm(Film newFilm, NotificationChain msgs) {
		Film oldFilm = film;
		film = newFilm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImdbPackage.VOTE__FILM, oldFilm, newFilm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilm(Film newFilm) {
		if (newFilm != film) {
			NotificationChain msgs = null;
			if (film != null)
				msgs = ((InternalEObject)film).eInverseRemove(this, ImdbPackage.FILM__VOTES, Film.class, msgs);
			if (newFilm != null)
				msgs = ((InternalEObject)newFilm).eInverseAdd(this, ImdbPackage.FILM__VOTES, Film.class, msgs);
			msgs = basicSetFilm(newFilm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.VOTE__FILM, newFilm, newFilm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject)user;
			user = (User)eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImdbPackage.VOTE__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.VOTE__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImdbPackage.VOTE__LIBRARY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLibrary((IMDB)otherEnd, msgs);
			case ImdbPackage.VOTE__FILM:
				if (film != null)
					msgs = ((InternalEObject)film).eInverseRemove(this, ImdbPackage.FILM__VOTES, Film.class, msgs);
				return basicSetFilm((Film)otherEnd, msgs);
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
			case ImdbPackage.VOTE__LIBRARY:
				return basicSetLibrary(null, msgs);
			case ImdbPackage.VOTE__FILM:
				return basicSetFilm(null, msgs);
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
			case ImdbPackage.VOTE__LIBRARY:
				return eInternalContainer().eInverseRemove(this, ImdbPackage.IMDB__VOTES, IMDB.class, msgs);
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
			case ImdbPackage.VOTE__LIBRARY:
				return getLibrary();
			case ImdbPackage.VOTE__SCORE:
				return getScore();
			case ImdbPackage.VOTE__FILM:
				if (resolve) return getFilm();
				return basicGetFilm();
			case ImdbPackage.VOTE__USER:
				if (resolve) return getUser();
				return basicGetUser();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImdbPackage.VOTE__LIBRARY:
				setLibrary((IMDB)newValue);
				return;
			case ImdbPackage.VOTE__SCORE:
				setScore((Integer)newValue);
				return;
			case ImdbPackage.VOTE__FILM:
				setFilm((Film)newValue);
				return;
			case ImdbPackage.VOTE__USER:
				setUser((User)newValue);
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
			case ImdbPackage.VOTE__LIBRARY:
				setLibrary((IMDB)null);
				return;
			case ImdbPackage.VOTE__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case ImdbPackage.VOTE__FILM:
				setFilm((Film)null);
				return;
			case ImdbPackage.VOTE__USER:
				setUser((User)null);
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
			case ImdbPackage.VOTE__LIBRARY:
				return getLibrary() != null;
			case ImdbPackage.VOTE__SCORE:
				return score != SCORE_EDEFAULT;
			case ImdbPackage.VOTE__FILM:
				return film != null;
			case ImdbPackage.VOTE__USER:
				return user != null;
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
		result.append(" (score: ");
		result.append(score);
		result.append(')');
		return result.toString();
	}

} //VoteImpl
