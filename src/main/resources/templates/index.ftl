<!DOCTYPE html>
<html>
	<#include "head.ftl">
	<body>
		<div>my first pring boot and freemarker application ${haha}, ${haha}</div>
		<#list list as item>
			${item}
		</#list>
	</body>
</html>