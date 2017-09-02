/**
 */
package imdb.impl;

import imdb.Actor;
import imdb.Figure;
import imdb.Film;
import imdb.ImdbPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imdb.impl.FigureImpl#getName <em>Name</em>}</li>
 *   <li>{@link imdb.impl.FigureImpl#getFilm <em>Film</em>}</li>
 *   <li>{@link imdb.impl.FigureImpl#getPlayedBy <em>Played By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FigureImpl extends MinimalEObjectImpl.Container implements Figure {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlayedBy() <em>Played By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> playedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FigureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImdbPackage.Literals.FIGURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.FIGURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Film getFilm() {
		if (eContainerFeatureID() != ImdbPackage.FIGURE__FILM) return null;
		return (Film)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilm(Film newFilm, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFilm, ImdbPackage.FIGURE__FILM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilm(Film newFilm) {
		if (newFilm != eInternalContainer() || (eContainerFeatureID() != ImdbPackage.FIGURE__FILM && newFilm != null)) {
			if (EcoreUtil.isAncestor(this, newFilm))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFilm != null)
				msgs = ((InternalEObject)newFilm).eInverseAdd(this, ImdbPackage.FILM__FIGURES, Film.class, msgs);
			msgs = basicSetFilm(newFilm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImdbPackage.FIGURE__FILM, newFilm, newFilm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getPlayedBy() {
		if (playedBy == null) {
			playedBy = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this, ImdbPackage.FIGURE__PLAYED_BY, ImdbPackage.ACTOR__PLAYS);
		}
		return playedBy;
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
			case ImdbPackage.FIGURE__FILM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFilm((Film)otherEnd, msgs);
			case ImdbPackage.FIGURE__PLAYED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlayedBy()).basicAdd(otherEnd, msgs);
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
			case ImdbPackage.FIGURE__FILM:
				return basicSetFilm(null, msgs);
			case ImdbPackage.FIGURE__PLAYED_BY:
				return ((InternalEList<?>)getPlayedBy()).basicRemove(otherEnd, msgs);
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
			case ImdbPackage.FIGURE__FILM:
				return eInternalContainer().eInverseRemove(this, ImdbPackage.FILM__FIGURES, Film.class, msgs);
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
			case ImdbPackage.FIGURE__NAME:
				return getName();
			case ImdbPackage.FIGURE__FILM:
				return getFilm();
			case ImdbPackage.FIGURE__PLAYED_BY:
				return getPlayedBy();
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
			case ImdbPackage.FIGURE__NAME:
				setName((String)newValue);
				return;
			case ImdbPackage.FIGURE__FILM:
				setFilm((Film)newValue);
				return;
			case ImdbPackage.FIGURE__PLAYED_BY:
				getPlayedBy().clear();
				getPlayedBy().addAll((Collection<? extends Actor>)newValue);
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
			case ImdbPackage.FIGURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ImdbPackage.FIGURE__FILM:
				setFilm((Film)null);
				return;
			case ImdbPackage.FIGURE__PLAYED_BY:
				getPlayedBy().clear();
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
			case ImdbPackage.FIGURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ImdbPackage.FIGURE__FILM:
				return getFilm() != null;
			case ImdbPackage.FIGURE__PLAYED_BY:
				return playedBy != null && !playedBy.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FigureImpl
