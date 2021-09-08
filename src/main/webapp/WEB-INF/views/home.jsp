<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="layout/header.jsp"%>

<div class="container">
	<c:forEach begin="0" end="2">
		<!-- 카드글 시작 -->
		<div class="card">
			<div class="card-body">
				<h4 class="card-title">타이틀 입니다</h4>
				<a href="#" class="btn btn-primary">상세보기</a>
			</div>
		</div>
		<br/>
		<!-- 카드글 끝 -->
	</c:forEach>
	
	<ul class="pagination d-flex justify-content-center">
		<li class="page-item"><a class="page-link" href="#">Prev</a></li>
		<li class="page-item"><a class="page-link" href="#">Next</a></li>
	</ul>

	<!-- 카드글 시작  ${sessionScope.principal.username}-->
	


	<%@ include file="layout/footer.jsp"%>