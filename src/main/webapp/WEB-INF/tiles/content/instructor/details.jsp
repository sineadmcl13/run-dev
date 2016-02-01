<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<div class="row">

    <div class="col-sm-12">
        <h2>Meet the Instructor <i class="fa fa-user"></i></h2>
        <br>
        <div class="row">
            <div class="col-sm-8">
                <form:form modelAttribute="instructorDetailsModel" cssClass="form-horizontal">
                    <div class="form-group">
                        <label for="forename" class="col-sm-2 control-label">Forename</label>
                        <div class="col-sm-10">
                            <input type="email" class="form-control" disabled id="forename" value="${instructorDetailsModel.instructor.forename}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="surname" class="col-sm-2 control-label">Surname</label>
                        <div class="col-sm-10">
                            <input type="email" class="form-control" disabled id="surname" value="${instructorDetailsModel.instructor.surname}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="speciality" class="col-sm-2 control-label">Speciality</label>
                        <div class="col-sm-10">
                            <input type="email" class="form-control" disabled id="speciality" value="${instructorDetailsModel.instructor.speciality}">
                        </div>
                    </div>
                </form:form>
                <a href="<c:url value="/course/list"/>" class="btn btn-primary pull-right">Back to Course List</a>
            </div>
        </div>
    </div>
</div>