package filter;

import java.io.File;
import java.io.IOException;
 
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
//@WebFilter(urlPatterns = { "*.png", "*.jpg", "*.gif" }, initParams = {
 //       @WebInitParam(name = "notFoundImage", value = "/image/null.png") })
public class AnnoFilter implements Filter {
 
    private String notFoundImage;
 
    public AnnoFilter() {
    }
 
    @Override
    public void init(FilterConfig fConfig) throws ServletException {
 
        // ==> /images/image-not-found.png
        notFoundImage = fConfig.getInitParameter("notFoundImage");
    }
 
    @Override
    public void destroy() {
    }
 
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
 
        HttpServletRequest req = (HttpServletRequest) request;
 
        // ==> /images/path/my-image.png
        // ==> /path1/path2/image.pngs
        String servletPath = req.getServletPath();
 
        System.out.println("servletpart= "+servletPath);
        // Đường dẫn tuyệt đối của thư mục gốc của WebApp (WebContent).
        String realRootPath = request.getServletContext().getRealPath("");
 
        // Đường dẫn tuyệt đối tới file ảnh.
        String imageRealPath = realRootPath + servletPath;
 
        System.out.println("imageRealPath = " + imageRealPath);
 
        File file = new File(imageRealPath);
 
        // Kiểm tra xem ảnh có tồn tại không.
        if (file.exists()) {
        	System.out.println("ton tai duong dan , cho qua filter");
            // Cho phép request được đi tiếp. (Vượt qua Filter này).
            // (Để đi tiếp tới file ảnh yêu cầu).
            chain.doFilter(request, response);
 
        } else if (!servletPath.equals(this.notFoundImage)) {
        	// trong truong hop neu duong dan toi anh null thi van la ton tai 
        	//(thuoc truong hop ben tren )
        	System.out.println("neu khong phai la null thi redirect toi anh null mac dinh ");
            // Redirect (Chuyển hướng) tới file ảnh 'image not found'.
            HttpServletResponse resp = (HttpServletResponse) response;
 
            // ==> /ServletFilterTutorial + /images/image-not-found.png
            resp.sendRedirect(req.getContextPath() + this.notFoundImage);
 
        }
 
    }
 
}