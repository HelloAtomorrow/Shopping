<%--
  Created by IntelliJ IDEA.
  User: Xiaoxiang
  Date: 2017.12.18
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>

<script>
    $(function(){
        $("ul.pagination li.disabled a").click(function(){
            return false;
        });
    });
</script>

<nav>
    <ul class="pagination">
        <li <c:if test="${!page.hasPrevious}">class="disabled"</c:if>>
            <a href="?currentLocation=0" aria-label="Previous" >
                <span aria-hidden="true">«</span>
            </a>
        </li>

        <li <c:if test="${!page.hasPrevious}">class="disabled"</c:if>>
            <a href="?currentLocation=${page.currentLocation - page.eachPageDataNumber}" aria-label="Previous" >
                <span aria-hidden="true">‹</span>
            </a>
        </li>

        <c:forEach begin="0" end="${page.totalPage-1}" varStatus="status">
            <li <c:if test="${status.index * page.eachPageDataNumber == page.currentLocation}">class="disabled"</c:if>>
                <a href="?currentLocation=${status.index * page.eachPageDataNumber}"
                   <c:if test="${status.index * page.eachPageDataNumber == page.currentLocation}">class="current"</c:if>
                   >${status.count}</a>
            </li>

        </c:forEach>

        <li <c:if test="${!page.hasNext}">class="disabled"</c:if>>
            <a href="?currentLocation=${page.currentLocation+page.eachPageDataNumber}" aria-label="Next">
                <span aria-hidden="true">›</span>
            </a>
        </li>
        <li <c:if test="${!page.hasNext}">class="disabled"</c:if>>
            <a href="?currentLocation=${page.lastPageDataNumber}" aria-label="Next">
                <span aria-hidden="true">»</span>
            </a>
        </li>
    </ul>
</nav>