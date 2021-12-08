package control;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginProc", value = "/LoginProc.do")
public class LoginProc extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    reqPro(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    reqPro(request,response);
    }

    private void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //이것의 의미는 위에 있는 똑같은 reqPro()메소드를 만들어서 이 함수가 doGet이 들어오든 doPost가 들어오든
        //상관이 없게끔 만든다.
        //이렇게 쓴 이유는 어떤 값이 들어오든 get으로 들어온건지 아니면 post로 들어온 건지 알기 어럅기 때문이다.
        String id =  request.getParameter("id");
        String password =  request.getParameter("password");
        System.out.println(id);

        request.setAttribute("id", id);//request객체에 데이터를 저장한다.
        request.setAttribute("password", password);//request객체에 데이터를 저장한다.

        RequestDispatcher dis = request.getRequestDispatcher("LoginProc.jsp");
    //RequestDispatcher클래스를 이용하여  LoginProc객체 즉 jsp 객체를 하나 만들고
        //이 dis객체에다가 forward함수를 이요하여 기존에 넣었던 request객체 값들과 response값들을 넣어준다.
        dis.forward(request, response);

    }

}
