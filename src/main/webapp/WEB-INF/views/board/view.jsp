<html lang="en">
  <head>
      <meta charset="UTF-8" />
      <meta http-equiv="X-UA-Compatible" content="IE=edge" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0" />
      <title>Document</title>
        <link
         href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
         rel="stylesheet"
         integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
         crossorigin="anonymous"
        />
  </head>
  <body>
    <div class="container mt-3">
    <div class="container text-center mt-5 fs-3">View</div>
    
      <table border="1" class="table table-striped">
   <thead>
                <tr>
                    <th>Title</th>
                    <th>Content</th>
                    <th>User Name</th>
                    <th>Date</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th>USER</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>2023.01.01</td>
                </tr>
      </tbody>
    </table>
    <form action="/board/list" method="get">
      <div>
        <button class="btn btn-success">List</button>
      </div>
    </form>
    <form action="/board/edit" method="get">
      <div>
        <button class="btn btn-success">Edit</button>
      </div>
    </form>
      <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
    </div>
  </body>
</html>

