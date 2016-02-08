<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<div class="row">
    <div class="col-sm-12">
        <h2>Courses Available</h2>
        <table class="table">
            <thead>
                <th>CourseID</th>
                <th>Name</th>
                <th>Instructor</th>
                <th>Level</th>
                <th>Credits</th>
            </thead>
            <tbody>
                <c:forEach items="${courseListModel.courseList}" var="course">
                    <tr>
                        <td>${course.id}</td>
                        <td>${course.name}</td>
                        <td><a href="<c:url value="/instructor/details/${course.instructor.id}"/> ">${course.instructor.fullName}</a></td>
                        <td>${course.level}</td>
                        <td>${course.credits}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="<c:url value='/course/add'/> " class="btn btn-primary pull-right">Add New Course</a>
    </div>
</div>