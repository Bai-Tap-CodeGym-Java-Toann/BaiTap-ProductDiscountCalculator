import java.io.IOException;
import java.io.PrintWriter;

public class DiscountCal extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request,
                          javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String requestPrice = request.getParameter("price");
        String requestDicountRate = request.getParameter("percent");


        if (requestDicountRate.matches("^[1-9][0-9]*$") &&
                requestPrice.matches("^[1-9][0-9]*$")) {
            int price = Integer.parseInt(requestPrice);
            double discountRate = Double.parseDouble(requestDicountRate) / 100;
            int discountAmount = (int) Math.round(price * discountRate);
            int discountPrice = price - discountAmount;
            writer.println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <title>Discount</title>\n" +
                    "    <style>\n" +
                    "        .ouput {\n" +
                    "            height: 180px;\n" +
                    "            width: 230px;\n" +
                    "            margin: auto;\n" +
                    "            padding: 20px;\n" +
                    "            border: 3px #CCC solid;\n" +
                    "        }\n" +
                    "    </style>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "    <div style=\"padding-top: 100px\">\n" +
                    "        <div class=\"ouput\">\n" +
                    "            <h2>Discount</h2>\n" +
                    "            Discount Price:\n" + discountPrice +
                    "            <br>\n" +
                    "            <br>\n" +
                    "            Discount Amount:\n" + discountAmount +
                    "            <br>\n" +
                    "            Discount Rate:\n" + discountRate + " %" +
                    "        </div>\n" +
                    "    </div>\n" +
                    "</form>\n" +
                    "</body>\n" +
                    "</html>");
        } else {
            response.sendRedirect(request.getContextPath());
        }

    }

}
