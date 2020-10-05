
<%@ taglib
			prefix="form"
			uri="http://www.springframework.org/tags/form"
%>
<%@ taglib
			prefix="spring"
			uri="http://www.springframework.org/tags"
%>
<%@ taglib
			prefix="c"
			uri="http://java.sun.com/jsp/jstl/core"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modification Client</title>
<meta
			name="viewport"
			content="width=device-width, initial-scale=1, shrink-to-fit=no"
>
<link
			rel="stylesheet"
			type="text/css"
			href="${pageContext.request.contextPath}/resources/css/mycss.css"
>

<link
			rel="stylesheet"
			href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
			integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
			crossorigin="anonymous"
>
</head>
<style>
.error {
	color: #ff0000;
}
</style>

<body>
			<div class="container-fluid">

						<div class="row">

									<%@include file="/WEB-INF/view/sidebar.jsp"%>

									<div
												id="main"
												class="col  "
									>
												<div class="row">

															<div class="col-12 p-0">

																		<%@include file="/WEB-INF/view/nav.jsp"%>

															</div>

															<div class="col-12  ">

																		<div class="row">

																					<div class="card m-2 shadow bg-white rounded">

																								<div class="card-header text-secondary">

																											<div class="row">

																														<c:if test="${not empty updateClient.photo }">
																																	<img
																																				class="rounded-circle "
																																				height="58"
																																				width="58"
																																				src="${pageContext.request.contextPath}/resources/images/photos/${updateClient.photo}"
																																				alt="photo"
																																	/>
																														</c:if>

																														<h1 class="display-5 ml-3">
																																	<c:if test="${updateClient.id gt 0 }"> [${updateClient.nom}
																														${updateClient.prenom}]</c:if>

																																	<c:if test="${updateClient.id == 0 }">[Création d'un nouveau client]</c:if>
																														</h1>


																											</div>
																											<span class="align-self-center ">Veuillez
																														modifier/remplir les champs</span>

																								</div>

																								<div class="card-body text-primary">

																											<!-- formulaire bootstrap -->

																											<form:form
																														method="POST"
																														servletRelativeAction="/client/update"
																														modelAttribute="updateClient"
																											>

																														<!-- permet de donner l'id du client en databinding avec modelAttribut
										 sans ca l'id est automatiquement mis a zero -->
																														<form:input
																																	type="hidden"
																																	path="id"
																														/>

																														<div
																																	class="form-row border shadow p-3 mb-3 bg-white rounded"
																														>

																																	<div class="form-row ">

																																				<div class="row col-12 justify-content-between">

																																							<!-- formulaire pour le nom -->
																																							<div class="form-group col-md-3">

																																										<form:label path="nom">Nom<sup>(*)</sup>
																																										</form:label>

																																										<form:input
																																													class="form-control text-secondary"
																																													path="nom"
																																										/>

																																										<!-- gestion des validations : messages d'erreurs -->

																																										<form:errors
																																													path="nom"
																																													cssClass="error"
																																										/>
																																							</div>

																																							<!-- formulaire pour le prenom -->
																																							<div class="form-group col-md-3 ">

																																										<form:label path="prenom">Prénom <sup>(*)</sup>
																																										</form:label>

																																										<form:input
																																													class="form-control text-secondary"
																																													path="prenom"
																																										/>

																																										<!-- gestion des validations : messages d'erreurs -->
																																										<form:errors
																																													path="prenom"
																																													cssClass="error"
																																										/>
																																							</div>
																																							<!-- formulaire pour le nom de la societe -->

																																							<div class="form-group col-md-3  ">
																																										<form:label path="nomSociete">Société</form:label>
																																										<form:input
																																													class="form-control text-secondary"
																																													path="nomSociete"
																																										/>
																																							</div>
																																							<!-- formulaire pour le  status du client-->

																																							<div class="form-group col-md-2 ">
																																										<form:label path="etatCustomer">Type de Contact</form:label>

																																										<form:select path="etatCustomer">
																																													<form:option
																																																value="C"
																																																label="Client"
																																													/>
																																													<form:option
																																																value="P"
																																																label="Prospect"
																																													/>
																																													<form:option
																																																value="F"
																																																label="Fournisseur"
																																													/>
																																										</form:select>
																																							</div>
																																				</div>

																																				<div class="row col-12 justify-content-between">

																																							<!-- formulaire pour le numero de telephone -->

																																							<div class="form-group col-md-3">
																																										<form:label path="numeroTel">Numero de téléphone<sup>
																																																(*)</sup>
																																										</form:label>

																																										<div class="input-group-prepend">
																																													<span
																																																class="input-group-text"
																																																id="addon-wrapping"
																																													>+33/0</span>


																																													<form:input
																																																class="form-control text-secondary"
																																																path="numeroTel"
																																													/>


																																													<!-- gestion des validations : messages d'erreurs -->
																																										</div>
																																										<form:errors
																																													path="numeroTel"
																																													cssClass="error"
																																										/>
																																							</div>

																																							<!-- formulaire pour le numero de adresse mail-->

																																							<div class="form-group col-md-3 ">
																																										<form:label path="email">Adresse mail</form:label>
																																										<form:input
																																													class="form-control text-secondary"
																																													path="email"
																																										/>
																																							</div>

																																							<!-- formulaire pour la date de prise de contact -->
																																							<div class="form-group col-md-3 ">

																																										<form:label path="dateContact">Date de prise de contact<sup>
																																																(*)</sup>
																																										</form:label>

																																										<form:input
																																													type="date"
																																													value="${updateClient.dateContact }"
																																													class="form-control text-secondary"
																																													path="dateContact"
																																										/>

																																										<!-- gestion des validations : messages d'erreurs -->
																																										<form:errors
																																													path="dateContact"
																																													cssClass="error"
																																										/>
																																							</div>

																																							<!--  formulaire pour la photo -->
																																							<div class="form-group col-md-2">
																																										<form:label path="photo">photo</form:label>
																																										<form:input
																																													class="form-control text-secondary"
																																													path="photo"
																																										/>
																																							</div>

																																				</div>

																																	</div>

																																	<span
																																				class="font-italic  "
																																				style="font-size: 0.8em;"
																																	>les champs avec <sup>(*)</sup> sont
																																				obligatoires!
																																	</span>
																														</div>

																														<div
																																	class="form-row border shadow p-3 mb-3 bg-white rounded"
																														>
																																	<!-- formulaire pour l'adresse du client -->
																																	<div class="form-group col-md-12">
																																				<form:label path="adresse">Adresse</form:label>
																																				<form:input
																																							type="text"
																																							class="form-control text-secondary"
																																							path="adresse"
																																				/>
																																	</div>

																																	<!-- formulaire pour la ville du client -->
																																	<div class="form-group col-md-4">
																																				<form:label path="ville">Ville</form:label>
																																				<form:input
																																							type="text"
																																							class="form-control text-secondary"
																																							path="ville"
																																				/>

																																	</div>

																																	<!-- formulaire pour le code postal de la ville -->
																																	<div class="form-group col-md-2 offset-1 ">
																																				<form:label path="CodePostal">Code Postal</form:label>
																																				<form:input
																																							class="form-control text-secondary"
																																							path="codePostal"
																																				/>
																																				<!-- gestion des validations : messages d'erreurs -->
																																				<form:errors
																																							path="codePostal"
																																							cssClass="error"
																																				/>
																																	</div>

																														</div>

																														<!-- formulaire pour les commentaires -->
																														<div
																																	class="form-row border rounded shadow p-3 mb-3 bg-white"
																														>
																																	<div class="form-group col-md-9">
																																				<form:label path="commentaire">Commentaire</form:label>
																																				<form:textarea
																																							class="form-control text-secondary"
																																							path="commentaire"
																																							rows="5"
																																				/>
																																	</div>
																														</div>

																														<!-- bouton de validation -->
																														<div class="row justify-content-center">
																																	<button
																																				type="submit"
																																				class="btn btn-primary col-3 "
																																	>Valider</button>
																														</div>

																											</form:form>
																								</div>
																					</div>
																		</div>
															</div>
												</div>
									</div>
						</div>
			</div>

			<script
						src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
						integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
						crossorigin="anonymous"
			></script>
			<script
						src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
						integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
						crossorigin="anonymous"
			></script>
			<script
						src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
						integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
						crossorigin="anonymous"
			></script>
</body>
</html>