
<style>
    body {
      border: 0;
      margin: 0;
      padding: 0;
      font-family: sans-serif;
      background-color: rgba(250, 250, 250)
    }
    
    .container {
      min-height: 3in;
      justify-content: center;
      align-items: center;
      display: flex;
      text-align: center;
    }
    
    .container div > p span {
      color: red;
    }
    
    p {
      position: relative;
      top: 30px;
    }
    
    
    
    button {
      cursor: pointer;
      border: 0;
      border-radius: 4px;
      font-weight: 600;
      margin: 0 10px;
      width: 200px;
      padding: 10px 0;
      box-shadow: 0 0 20px rgba(104, 85, 224, 0.2);
      transition: 0.4s;
    }
    
    
    
    .btn {
      color: rgb(104, 85, 224);
      background-color: rgba(255, 255, 255, 1);
      border: 1px solid rgba(104, 85, 224, 1);
    }
    
    button:hover {
      color: white;
      box-shadow: 0 0 20px rgba(104, 85, 224, 0.6);
      background-color: rgba(104, 85, 224, 1);
    }
    
    
    </style>
    <center><p><h1> Welcome to Mobile Car Wash </h1></p></center>
    <div class="container">
      <div>
        <button class="btn" onclick="location.href='Alogin.jsp'">Admin</button>
        <button class="btn" onclick="location.href='Ulogin.jsp'">User</button>
        
      </div>
    </div>