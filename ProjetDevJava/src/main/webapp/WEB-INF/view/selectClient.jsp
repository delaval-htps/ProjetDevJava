<%@ page
			language="java"
			contentType="text/html; charset=UTF-8"
			pageEncoding="UTF-8"
%>
<%@ taglib
			prefix="c"
			uri="http://java.sun.com/jsp/jstl/core"
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
															<div class="col-12 p-0 ">
																		<%@include file="/WEB-INF/view/nav.jsp"%>
															</div>

															<div class="col-12 p-3 ">
																		<div
																					class="card mb-3 shadow p-3 mb-5 bg-white rounded"
																		>
																					<div class="row no-gutters">
																								<div
																											class="col-md-3"
																											style="margin: auto;"
																								>
																											<img
																														src="${pageContext.request.contextPath }/resources/images/photos/${selectClient.photo}"
																														class=" rounded mx-auto d-block"
																														alt="photo non renseignée..."
																											>
																								</div>
																								<div class="col-md-7 ">
																											<div class="card-body">
																														<h1 class="card-title display-4">${selectClient.prenom }
																																	${selectClient.nom}</h1>

																														<table
																																	class="table-borderless table-striped table-sm "
																														>
																																	<tr>

																																				<td>Nom de Société :</td>
																																				<td class="text-secondary">${selectClient.nomSociete }</td>
																																	<tr>
																																				<td>Adresse :</td>
																																				<td class="text-secondary">${selectClient.adresse }</td>
																																	</tr>

																																	<tr>
																																				<td>Code Postal :</td>
																																				<td class="text-secondary"><c:if
																																										test="${not empty selectClient.codePostal}"
																																							>${selectClient.codePostal}</c:if> <c:if
																																										test="${empty selectClient.codePostal}"
																																							>_ _ _ _ _</c:if></td>
																																	</tr>

																																	<tr>
																																				<td>Ville :</td>
																																				<td class="text-secondary">${selectClient.ville }</td>
																																	</tr>
																																	<tr>
																																				<td>numéro de Tel :</td>
																																				<td class="text-secondary">0${selectClient.numeroTel }
																																				</td>
																																	</tr>
																																	<tr>
																																				<td>Adresse Mail :</td>
																																				<td class="text-secondary">${selectClient.email }</td>
																																	</tr>
																																	<tr>
																																				<td>Status du Contact:</td>
																																				<td class="text-secondary"><c:choose>
																																										<c:when
																																													test="${selectClient.etatCustomer=='C'.charAt(0)}"
																																										>
																																													<span class="text-danger">Client</span>
																																										</c:when>
																																										<c:when
																																													test="${selectClient.etatCustomer=='P'.charAt(0)}"
																																										>
																																													<span class="text-warning">Prospect</span>
																																										</c:when>
																																										<c:when
																																													test="${selectClient.etatCustomer=='F'.charAt(0)}"
																																										>
																																													<span class="text-primary">Fournisseur</span>
																																										</c:when>
																																										<c:otherwise>non définit</c:otherwise>
																																							</c:choose></td>
																																	</tr>
																																	<tr>
																																				<td>Date de prise de contact :</td>
																																				<td class="text-secondary">${selectClient.dateContact }
																																				</td>
																																	</tr>
																																	<tr>
																																				<td>Commentaire :</td>
																																				<td class="text-secondary">${selectClient.commentaire }
																																				</td>
																																	</tr>
																														</table>

																														<p class="card-text">
																																	<small class="text-muted">Last
																																				updated 3 mins ago</small>
																														</p>
																											</div>
																								</div>
																								<div class="col-md-2 text-center m-auto">

																											<p>
																														<a
																																	class="btn btn-success btn-sm btn-block"
																																	href="formClientId?id=${selectClient.id }"
																																	role="button"
																														>Modifier</a>
																											</p>
																											<p>
																														<a
																																	class="btn btn-danger btn-sm btn-block"
																																	href="delete?id=${selectClient.id }"
																																	role="button"
																														>Supprimer</a>
																											</p>
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