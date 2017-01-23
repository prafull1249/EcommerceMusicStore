<%--
  Created by IntelliJ IDEA.
  User: Prafull
  Date: 1/22/2017
  Time: 11:30 PM
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<!-- Marketing messaging and featurettes
================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container-wrapper row">

    <div class="container">

        <div class="page-header">
            <h1> ${product.productName} </h1>
            <p class="lead">The details of the ${product.productName} are as follows!! </p>
        </div>

        <div class="container">

            <div class="row">

                <div class="col-md-5"><img src="image" width="100%" height="500px"/></div>
                <div class="col-md-5">
                    <p class="lead">${product.productName}</p>
                    <p>${product.productDescription}</p>
                    <p class="lead">${product.productCategory}</p>
                    <p class="lead">${product.productPrice}</p>

                </div>

                </div>
            </div>




<%@include file="/WEB-INF/views/template/footer.jsp"%>