<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<div class="row">
    <div class="col-sm-12">
        <h2>Add New Course</h2>

        <form:form modelAttribute="courseAddModel" method="post" cssClass="form-horizontal">

            <div class="form-group">
                <label for="course.name" class="col-sm-2 control-label">Name</label>
                <div class="col-sm-10">
                    <form:input path="course.name" class="form-control" placeholder="Course Name"/>
                </div>
            </div>

            <div class="form-group">
                <label for="course.level" class="col-sm-2 control-label">Level</label>
                <div class="col-sm-10">
                    <form:input path="course.level" class="form-control" placeholder="Course Level"/>
                </div>
            </div>

            <div class="form-group">
                <label for="course.credits" class="col-sm-2 control-label">Credits</label>
                <div class="col-sm-10">
                    <form:input path="course.credits" class="form-control" placeholder="Course Credits"/>
                </div>
            </div>


            <button type="submit" class="btn btn-primary">Add New Course</button>
        </form:form>
    </div>
</div>
