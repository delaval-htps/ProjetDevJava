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

																		<div class="card shadow p-3 mb-5 bg-white rounded">

																					<div class="card-header listClientHeader ">
																								<div class="row">
																											<div>
																														<img
																																	src="${pageContext.request.contextPath }/resources/images/icones/people.svg"
																																	width="28"
																																	height="28"
																														/> <span class="h5 align-middle pl-1">Clients</span>
																											</div>
																											<a
																														class="btn btn-sm btn-outline-primary ml-auto"
																														href="formNewClient"
																														role="button"
																											>Nouveau Client</a>
																											<!-- 																								</div> -->
																								</div>
																					</div>

																					<div class="card-body">

																								<table class=" table-hover table  ">
																											<caption >
																													Image par <a
																																	href="https://pixabay.com/fr/users/whitesession-4645995/?utm_source=link-attribution&amp;utm_medium=referral&amp;utm_campaign=image&amp;utm_content=2756210"
																														>Angelo Esslinger</a> et <a
																																	href="https://pixabay.com/fr/users/nastya_gepp-3773230/?utm_source=link-attribution&amp;utm_medium=referral&amp;utm_campaign=image&amp;utm_content=3560917"
																														>Anastasia Gepp</a> de <a
																																	href="https://pixabay.com/fr/?utm_source=link-attribution&amp;utm_medium=referral&amp;utm_campaign=image&amp;utm_content=2756210"
																														>Pixabay</a>
																											</caption>
																											<thead class="thead">
																														<tr>
																																	<th scope="col"><input
																																				type="checkbox"
																																	/></th>
																																	<th scope="col"></th>
																																	<th scope="col">Nom</th>
																																	<th scope="col">Prénom</th>
																																	<th scope="col">Numéro Tel</th>
																																	<th scope="col">Email</th>
																																	<th scope="col">Société</th>
																														</tr>
																											</thead>
																											<tbody>

																														<c:forEach
																																	items="${clients}"
																																	var="client"
																														>

																																	<tr data-href="select?id=${client.id}">

																																				<td class="align-middle"><input
																																							type="checkbox"
																																				/></td>

																																				<td
																																							id="tdImgList"
																																							scope="row"
																																							class="align-middle text-center"
																																				><img
																																							class="rounded-circle "
																																							height="42"
																																							width="42"
																																							src="${pageContext.request.contextPath}/resources/images/photos/${client.photo}"
																																							alt="${client.nom.charAt(0)}"
																																				/></td>
																																				<td class="align-middle"><span
																																							class="font-weight-bold font-italic"
																																				> ${client.nom}</span></td>
																																				<td class="align-middle">${client.prenom}</td>
																																				<td class="align-middle">0${client.numeroTel}</td>
																																				<td class="align-middle">${client.email}</td>
																																				<td class="align-middle">${client.nomSociete}</td>

																																	</tr>
																														</c:forEach>
																											</tbody>
																								</table>
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

			<!--  js permettant de selectionner une ligne de tableau directement -->
			<script type="text/javascript">
				$('tr[data-href]').on("click", function() {
					document.location = $(this).data('href');
				});
			</script>
</body>
</html>