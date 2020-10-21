
<nav class=" navbar navbar-expand-lg  border-bottom mb-2 ">
	<a class="navbar-brand "
		href="${pageContext.request.contextPath }/"> <img
		src="${pageContext.request.contextPath }/resources/images/logoCrm.svg"
		width="30" height="30" class="d-inline-block align-top" alt=""
		loading="lazy"><span class=" pl-1 h5  align-middle text-dark ">CRM</span>
	</a>
	<!-- bouton de collapse pour le sidebar vertical -->
	<buton class="btn btn-outline-light mr-2 d-lg-none"> <img
		src="${pageContext.request.contextPath }/resources/images/icones/arrow-left-right.svg"
		data-toggle="collapse" data-target="#sidebarMenu"
		aria-expanded="false" aria-controls="sidebarMenu" /> </buton>

	<form class="form-inline my-2 my-lg-0 ">
		<input class="form-control mr-sm-2" type="search"
			placeholder="Search...">
		<!-- 				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button> -->
	</form>
	<span class="navbar-text ml-auto p-2"> Connexion </span>
	<!-- ml-auto permet de mettre au fond de la ligne l'element -->

</nav>
