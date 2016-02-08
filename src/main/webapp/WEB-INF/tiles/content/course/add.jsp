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

            <div class="form-group">
                <label for="course.instructor" class="col-sm-2 control-label">Instructor</label>
                <div class="col-sm-10">
                    <form:select path="course.instructor" class="form-control" placeholder="Course INstructor">
                        <form:option value="">None</form:option>
                        <c:forEach items="${courseAddModel.instructorList}" var="instructor">
                            <form:option value="${instructor.id}">${instructor.fullName}</form:option>
                        </c:forEach>
                    </form:select>
                </div>
            </div>


            <div class="pull-right">
                <button type="submit" class="btn btn-success">Add New Course</button>
                <a href="<c:url value='/course/list'/>" class="btn btn-primary">Back to Course List</a>
            </div>

        </form:form>
    </div>
</div>
