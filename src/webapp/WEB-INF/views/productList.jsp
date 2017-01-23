<%--
  Created by IntelliJ IDEA.
  User: Prafull
  Date: 1/22/2017
  Time: 11:30 PM
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@include file="/WEB-INF/views/template/header.jsp"%>

<!-- Marketing messaging and featurettes
================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container-wrapper row">

    <div class="container">

        <div class="page-header">
            <h1> We have these amazing products available. Check them out !! </h1>
        </div>

        <table class="table table-bordered table-responsive table-hover">
            <tr>
            <thead>
                <th>Photo Thumb</th>
                <th>Product Name</th>
                <th>Product Category</th>
                <th>Product Condition</th>
                <th>Product Price</th>
            </thead>

            </tr>
            <c:forEach items="${products}" var="product">
                <tr>
                    <td><img src="#" alt="image"/></td>
                    <td>${product.productName}</td>
                    <td>${product.productCategory}</td>
                    <td>${product.productCondition}</td>
                    <td>${product.productPrice}</td>

                    <td><a href="<spring:url value ="/productList/viewProduct/${product.productId}" />">
                        info </a></td>
                </tr>
            </c:forEach>
        </table>


<%@include file="/WEB-INF/views/template/footer.jsp"%>