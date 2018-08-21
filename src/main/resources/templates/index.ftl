<html>

<head>
    <meta charset="utf-8"/>
    <title>未正常polling</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table">
                <thead>
                <tr>
                    <th>PROCESS_CODE</th>
                    <th>SERVER_CODE</th>
                    <th>BATCH_ID</th>
                    <th>SOA_PULLING_FLAG</th>
                    <th>CREATION_DATE</th>
                    <th>ACTION</th>
                </tr>
                </thead>
                <tbody>
                <#list  list as ControlTable>
                <tr>
                    <td>${ControlTable.processCode}</td>
                    <td>${ControlTable.serverCode}</td>
                    <td>${ControlTable.batchId}</td>
                    <td>${ControlTable.soaPullingFlag}</td>
                    <td>${ControlTable.creationDate}</td>
                    <td><a href="/poll/email?processCode=${ControlTable.processCode}&serverCode=${ControlTable.serverCode}&batchId=${ControlTable.batchId}">send email</a></td>
                </tr>

                </#list>
                </tbody>
            </table>
        </div>
    </div>
</div>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <ul class="pagination">
                <li>
                    <a href="#">Prev</a>
                </li>
                <li>
                    <a href="#">1</a>
                </li>
                <li>
                    <a href="#">2</a>
                </li>
                <li>
                    <a href="#">3</a>
                </li>
                <li>
                    <a href="#">4</a>
                </li>
                <li>
                    <a href="#">5</a>
                </li>
                <li>
                    <a href="#">Next</a>
                </li>
            </ul>
        </div>
    </div>
</div>


</body>


</html>