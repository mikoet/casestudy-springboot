<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8">
        <title>${pageTitle}</title>
        <link rel="stylesheet" type="text/css" href="/css/styles.css">
    </head>
    <body>
        <h1>${pageTitle}</h1>

		<p>
			Es
			<#if standardList?size == 1>
				wurde 1 Standard
			<#else>
				wurden ${standardList?size} Standards
			</#if>
			gefunden.
		</p>

		<#list standardList as standard>
			<hr>
			<div>
				<br>
				<strong>${standard.documentNo} — ${standard.title}</strong>
				<br><br>

				Ausgabedatum: ${standard.issueDate.format("yyyy-MM")}
				<br>

				<#if standard.workingGremium?has_content && standard.workingGremiumId?has_content >
					Erarbeitendes Gremium:
					<a
						href="https://din.de/?gremId=${standard.workingGremiumId}"
						target=”_blank”
					>${standard.workingGremium}</a>
					<br>
				<#elseif standard.workingGremium?has_content>
					Erarbeitendes Gremium: ${standard.workingGremium}
					<br>
				</#if>
				<br>
			</div>
		</#list>

		<hr>

		<#assign nowTime = .now>
		<p>Generiert: ${nowTime?string["yyy-MM-dd, HH:mm:ss"]} Uhr</p>

    </body>
</html>
