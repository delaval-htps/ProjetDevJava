
<%@ taglib
			prefix="form"
			uri="http://www.springframework.org/tags/form"
%>
<%@ taglib
			prefix="spring"
			uri="http://www.springframework.org/tags"
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des Clients</title>
<meta
			name="viewport"
			content="width=device-width, initial-scale=1, shrink-to-fit=no"
>
<link
			rel="stylesheet"
			href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
			integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
			crossorigin="anonymous"
>
</head>
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

																					<div class="card m-3 shadow bg-white rounded">

																								<div class="card-header text-secondary">

																											<!--  formulaire pour la photo -->
																											<%-- 									<form class="form-inline my-2 my-lg-0"> --%>
																											<!-- 										<div class="form-group col-md-3"> -->
																											<%-- 											<form:label path="photo">photo</form:label> --%>
																											<%-- 											<form:input class="form-control text-secondary" path="photo" /> --%>
																											<!-- 										</div> -->
																											<%-- 									</form> --%>

																											<h1 class="display-5">[${updateClient.nom}
																														${updateClient.prenom}]</h1>

																								</div>

																								<div class="card-body text-primary">

																											<!-- formulaire bootstrap -->

																											<form:form
																														method="POST"
																														servletRelativeAction="/client/update"
																														modelAttribute="updateClient"
																											>

																														<!-- permet de donner l'id du client en databinding avec modelAttribut sans ca l'id est automatiquement mis a zero -->
																														<form:input
																																	type="hidden"
																																	path="id"
																														/>

																														<div
																																	class="form-row border shadow p-3 mb-3 bg-white rounded"
																														>

																																	<div
																																				class="form-row justify-content-around"
																																	>

																																				<div class="form-group col-md-3">

																																							<form:label path="nom">Nom</form:label>

																																							<form:input
																																										class="form-control text-secondary"
																																										path="nom"
																																							/>
																																				</div>
																																				<div class="form-group col-md-3 ">
																																							<form:label path="prenom">Prénom</form:label>
																																							<form:input
																																										class="form-control text-secondary"
																																										path="prenom"
																																							/>
																																				</div>
																																				<div class="form-group col-md-3  ">
																																							<form:label path="nomSociete">Société</form:label>
																																							<form:input
																																										class="form-control text-secondary"
																																										path="nomSociete"
																																							/>
																																				</div>
																																				<div class="form-group col-md-2 ">
																																							<form:label path="etatCustomer">Type de Contact</form:label>
																																							<form:input
																																										class="form-control text-secondary"
																																										path="etatCustomer"
																																							/>
																																				</div>

																																				<div class="form-group col-md-3">
																																							<form:label path="numeroTel">Numero de téléphone</form:label>
																																							<div class="input-group-prepend">
																																										<span
																																													class="input-group-text"
																																													id="addon-wrapping"
																																										>+33/0</span>

																																										<form:input
																																													class="form-control text-secondary"
																																													path="numeroTel"
																																										/>
																																							</div>
																																				</div>
																																				<div class="form-group col-md-3 ">
																																							<form:label path="email">Adresse mail</form:label>
																																							<form:input
																																										class="form-control text-secondary"
																																										path="email"
																																							/>
																																				</div>
																																				<div class="form-group col-md-3 ">
																																							<form:label path="dateContact">Date de prise de contact</form:label>
																																							<form:input
																																										type="date"
																																										value="23/08/1976"
																																										class="form-control text-secondary"
																																										path="dateContact"
																																							/>
																																				</div>

																																	</div>
																														</div>
																														<div
																																	class="form-row border shadow p-3 mb-3 bg-white rounded"
																														>
																																	<div class="form-group col-md-12">
																																				<form:label path="adresse">Adresse</form:label>
																																				<form:input
																																							type="text"
																																							class="form-control text-secondary"
																																							path="adresse"
																																							placeholder="1234 Main St"
																																				/>
																																	</div>
																																	<div class="form-group col-md-4">
																																				<form:label path="ville">Ville</form:label>
																																				<form:input
																																							type="text"
																																							class="form-control text-secondary"
																																							path="ville"
																																				/>

																																	</div>
																																	<div
																																				class="form-group col-md-2 offset-1 "
																																	>
																																				<form:label path="CodePostal">Code Postal</form:label>
																																				<form:input
																																							type="number"
																																							class="form-control text-secondary"
																																							path="codePostal"
																																				/>
																																	</div>

																														</div>
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
																														<div class="row justify-content-center">
																																	<button
																																				type="submit"
																																				class="btn btn-primary "
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