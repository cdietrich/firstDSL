/**
 */
package imdb.impl;

import imdb.Actor;
import imdb.Figure;
import imdb.IMDB;
import imdb.ImdbPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imdb.impl.ActorImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link imdb.impl.ActorImpl#getPlays <em>Plays</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends PersonImpl implements Actor {
	/**
	 * The cached value of the '{@link #getPlays() <em>Plays</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlays()
	 * @generated
	 * @ordered
	 */
	protected EList<Figure> plays;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImdbPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMDB getLibrary() {
		if (eContainerFeatureID() != ImdbPackage.ACTOR__LIBRARY) return null;
		return (IMDB)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrary(IMDB newLibrary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLibrary, ImdbPackage.ACTOR__LIBRARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(IMDB newLibrary) {
		if (newLibrary != eInternalContainer() || (eContainerFeatureID() != ImdbPackage.ACTOR__LIBRARY && newLibrary != null)) {
			if (EcoreUtil.isAncestor(this, newLibrary))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLibrary != null)
				msgs = ((InternalEObject)newLibrary).eInverseAdd(this, ImdbPackage.IMDB__ACTORS, IMDB.class, msgs);
			msgs = basicSetLibrary(newLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.ACTOR__LIBRARY, newLibrary, newLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Figure> getPlays() {
		if (plays == null) {
			plays = new EObjectWithInverseResolvingEList.ManyInverse<Figure>(Figure.class, this, ImdbPackage.ACTOR__PLAYS, ImdbPackage.FIGURE__PLAYED_BY);
		}
		return plays;
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
			case ImdbPackage.ACTOR__LIBRARY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLibrary((IMDB)otherEnd, msgs);
			case ImdbPackage.ACTOR__PLAYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlays()).basicAdd(otherEnd, msgs);
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
			case ImdbPackage.ACTOR__LIBRARY:
				return basicSetLibrary(null, msgs);
			case ImdbPackage.ACTOR__PLAYS:
				return ((InternalEList<?>)getPlays()).basicRemove(otherEnd, msgs);
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
			case ImdbPackage.ACTOR__LIBRARY:
				return eInternalContainer().eInverseRemove(this, ImdbPackage.IMDB__ACTORS, IMDB.class, msgs);
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
			case ImdbPackage.ACTOR__LIBRARY:
				return getLibrary();
			case ImdbPackage.ACTOR__PLAYS:
				return getPlays();
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
			case ImdbPackage.ACTOR__LIBRARY:
				setLibrary((IMDB)newValue);
				return;
			case ImdbPackage.ACTOR__PLAYS:
				getPlays().clear();
				getPlays().addAll((Collection<? extends Figure>)newValue);
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
			case ImdbPackage.ACTOR__LIBRARY:
				setLibrary((IMDB)null);
				return;
			case ImdbPackage.ACTOR__PLAYS:
				getPlays().clear();
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
			case ImdbPackage.ACTOR__LIBRARY:
				return getLibrary() != null;
			case ImdbPackage.ACTOR__PLAYS:
				return plays != null && !plays.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActorImpl
