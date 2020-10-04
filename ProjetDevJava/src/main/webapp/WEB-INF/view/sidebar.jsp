<nav
			id="sidebarMenu"
			class="col-md-3 col-lg-2 border-right  collapse show  "
>
			<div class="position-sticky">
						<div class="row ">
									<a
												class="navbar-brand ml-2 pt-3 "
												href="${pageContext.request.contextPath }/"
									> <img
												src="${pageContext.request.contextPath }/resources/images/logoCrm.svg"
												width="30"
												height="30"
												class="d-inline-block align-top"
												alt=""
												loading="lazy"
									><span class=" pl-1 h5  align-middle text-dark ">CRM</span>
									</a>

						</div>
						<ul class="nav flex-column justify-content-start pt-5 ">
									

									<li class="nav-item"><a
												class="nav-link active"
												aria-current="page"
												href="${pageContext.request.contextPath }/"
									> <span data-feather="home"></span> Home
									</a></li>
									<li class="nav-item"><a
												class="nav-link"
												href="${pageContext.request.contextPath }/client/list"
									> <span data-feather="Clients"></span> Clients
									</a></li>
									<li class="nav-item"><a
												class="nav-link"
												href="${pageContext.request.contextPath }/resources/docs/html/index.html"
												target="_blank"
									> <span data-feather="Docs"></span> Doc Générale
									</a></li>
									<li class="nav-item"><a
												class="nav-link"
												href="${pageContext.request.contextPath }/resources/docs/javadoc/index.html"
												target="_blank"
									> <span data-feather="Docs"></span> Javadoc
									</a></li>
						</ul>
			</div>
</nav>