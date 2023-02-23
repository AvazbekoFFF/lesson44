<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List of Books</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>


<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="http://localhost:9089/info">HOME</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Features <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Pricing <span class="sr-only">(current)</span></a>
      </li>
    </ul>
  </div>
</nav>


<div class="container">
   <table class="table table-hover">
     <thead>
       <tr>
         <th scope="col">name</th>
         <th scope="col">lastName</th>
         <th scope="col">age</th>
         <th scope="col">taken book</th>
         <th scope="col">reads now</th>
       </tr>
     </thead>
      <tfoot>
            <tr>
                <th scope="col">name</th>
                <th scope="col">lastName</th>
                <th scope="col">age</th>
                <th scope="col">taken book</th>
                <th scope="col">reads now</th>
            </tr>
       </tfoot>
     <tbody>
       <#list employeesBooks as empBook>
        <tr>
            <td>${empBook.name}</td>
            <td>${empBook.lastname}</td>
            <td>${empBook.age}</td>
            <td>${empBook.takenBook}</td>
            <td>${empBook.readsNow}</td>
            <td><a type="button" class="btn btn-info" href="/employeeBooks/employees">info about employees</a></td>
        </tr>

        </#list>
     </tbody>
   </table>
</body>
</html>