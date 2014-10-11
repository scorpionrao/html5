package concurrency_chapter2;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import net.jcip.annotations.NotThreadSafe;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class UnsafeCountingFactorizer 
	implements Servlet {
	private AtomicLong count = new AtomicLong(0);
	public long getCount() { return count.get(); }
	public void service(ServletRequest req,
			ServletResponse resp) {
		count.incrementAndGet();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
