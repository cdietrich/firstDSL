/**
 */
package imdb.impl;

import imdb.Actor;
import imdb.Film;
import imdb.IMDB;
import imdb.ImdbPackage;
import imdb.User;
import imdb.Vote;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IMDB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imdb.impl.IMDBImpl#getFilms <em>Films</em>}</li>
 *   <li>{@link imdb.impl.IMDBImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link imdb.impl.IMDBImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link imdb.impl.IMDBImpl#getVotes <em>Votes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IMDBImpl extends MinimalEObjectImpl.Container implements IMDB {
	/**
	 * The cached value of the '{@link #getFilms() <em>Films</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilms()
	 * @generated
	 * @ordered
	 */
	protected EList<Film> films;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The cached value of the '{@link #getVotes() <em>Votes</em>}' containment reference list.
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
	protected IMDBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImdbPackage.Literals.IMDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Film> getFilms() {
		if (films == null) {
			films = new EObjectContainmentWithInverseEList<Film>(Film.class, this, ImdbPackage.IMDB__FILMS, ImdbPackage.FILM__LIBRARY);
		}
		return films;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentWithInverseEList<Actor>(Actor.class, this, ImdbPackage.IMDB__ACTORS, ImdbPackage.ACTOR__LIBRARY);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentWithInverseEList<User>(User.class, this, ImdbPackage.IMDB__USERS, ImdbPackage.USER__LIBRARY);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vote> getVotes() {
		if (votes == null) {
			votes = new EObjectContainmentWithInverseEList<Vote>(Vote.class, this, ImdbPackage.IMDB__VOTES, ImdbPackage.VOTE__LIBRARY);
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
			case ImdbPackage.IMDB__FILMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFilms()).basicAdd(otherEnd, msgs);
			case ImdbPackage.IMDB__ACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActors()).basicAdd(otherEnd, msgs);
			case ImdbPackage.IMDB__USERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsers()).basicAdd(otherEnd, msgs);
			case ImdbPackage.IMDB__VOTES:
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
			case ImdbPackage.IMDB__FILMS:
				return ((InternalEList<?>)getFilms()).basicRemove(otherEnd, msgs);
			case ImdbPackage.IMDB__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
			case ImdbPackage.IMDB__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case ImdbPackage.IMDB__VOTES:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImdbPackage.IMDB__FILMS:
				return getFilms();
			case ImdbPackage.IMDB__ACTORS:
				return getActors();
			case ImdbPackage.IMDB__USERS:
				return getUsers();
			case ImdbPackage.IMDB__VOTES:
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
			case ImdbPackage.IMDB__FILMS:
				getFilms().clear();
				getFilms().addAll((Collection<? extends Film>)newValue);
				return;
			case ImdbPackage.IMDB__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case ImdbPackage.IMDB__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case ImdbPackage.IMDB__VOTES:
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
			case ImdbPackage.IMDB__FILMS:
				getFilms().clear();
				return;
			case ImdbPackage.IMDB__ACTORS:
				getActors().clear();
				return;
			case ImdbPackage.IMDB__USERS:
				getUsers().clear();
				return;
			case ImdbPackage.IMDB__VOTES:
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
			case ImdbPackage.IMDB__FILMS:
				return films != null && !films.isEmpty();
			case ImdbPackage.IMDB__ACTORS:
				return actors != null && !actors.isEmpty();
			case ImdbPackage.IMDB__USERS:
				return users != null && !users.isEmpty();
			case ImdbPackage.IMDB__VOTES:
				return votes != null && !votes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IMDBImpl
