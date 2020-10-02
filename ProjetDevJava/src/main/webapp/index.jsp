<!DOCTYPE html>
<html>
<head>
<meta charset="utf8" />
<meta
			name="viewport"
			content="width=device-width, initial-scale=1, shrink-to-fit=no"
>
<link
			rel="stylesheet"
			type="text/css"
			href="${pageContext.request.contextPath}/resources/css/myCss.css"
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
															<div class="col-12">
																		<div class="row">
																					<div class="col-sm-4 offset-4">
																								<div
																											class="card shadow p-3 mb-5 bg-white rounded"
																								>
																											<div class="card-body text-center">
																														<h5 class="card-title">Gestions des
																																	Clients</h5>

																														<a
																																	href="${pageContext.request.contextPath }/client/list"
																																	class="btn btn-primary"
																														> <img
																																	src="${pageContext.request.contextPath }/resources/images/icones/people.svg"
																																	width="32"
																																	height="32"
																														/></a>
																											</div>
																								</div>
																					</div>
																		</div>
															</div>
															<div class="col-12">
																		<div class="row justify-content-around ">

																					<div class="col-sm-4  ">
																								<div
																											class="card shadow p-3 mb-5 bg-white rounded"
																								>
																											<div class="card-body text-center">
																														<h5 class="card-title">Gestions des
																																	Devis</h5>

																														<a
																																	href="${pageContext.request.contextPath }/devis/list"
																																	class="btn btn-primary"
																														><img
																																	src="${pageContext.request.contextPath }/resources/images/icones/pencil-square.svg"
																																	width="32"
																																	height="32"
																														/></a>
																											</div>
																								</div>
																					</div>
																					<div class="col-sm-4 ">
																								<div
																											class="card shadow p-3 mb-5 bg-white rounded"
																								>
																											<div class="card-body text-center">
																														<h5 class="card-title">Gestions des
																																	Factures</h5>

																														<a
																																	href="${pageContext.request.contextPath }/facture/list#"
																																	class="btn btn-primary"
																														><img
																																	src="${pageContext.request.contextPath }/resources/images/icones/invoice.svg"
																																	width="32"
																																	height="32"
																														/></a>
																											</div>
																								</div>
																					</div>
																		</div>
															</div>
															<div class="col-12">
																		<div class="row">
																					<div class="col-sm-4 offset-4">
																								<div
																											class="card shadow p-3 mb-5 bg-white rounded"
																								>
																											<div class="card-body text-center">
																														<h5 class="card-title">Gestions des
																																	Articles</h5>

																														<a
																																	href="${pageContext.request.contextPath }/articles"
																																	class="btn btn-primary"
																														><img
																																	src="${pageContext.request.contextPath }/resources/images/icones/box.svg"
																																	width="32"
																																	height="32"
																														/></a>
																											</div>
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
