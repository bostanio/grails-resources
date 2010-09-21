<html>
<head>
<g:set var="output">
<!-- Here we pull in our smart links, and capture them just for sake of demo page output -->
<r:module name="app"/>
<!-- This tests resource duplication detection for explicit resourceLink -->
<r:resourceLink dir="css" file="main.css"/>
<!-- This tests resource tag enhancement for legacy usage -->
<r:resourceLink dir="css" file="legacy.css"/>
</g:set>

    ${output}
</head>
<body>
    <h1>This is the resource test page</h1>
    <p>It produced the following output in the head section</p>
    <pre>
        ${output.encodeAsHTML()}
    </pre>
    <p>Resource cache info:</p>
    <pre>${grailsApplication.mainContext.resourceService.dumpResources().encodeAsHTML()}</pre>
    
</body>
</html>