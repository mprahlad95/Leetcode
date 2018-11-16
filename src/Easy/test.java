package Easy;

import java.util.*;

public class test {

	public static void main(String[] args) {

		System.out.println(numUniqueEmails());

	}

	public static int numUniqueEmails() {

		String[] emails = { "j+ezsorqlmc@rfpycgjuf.com", "j+k+ri+rigt.ad@rfpycgjuf.com", "hfmeqzk.isx+i@fiidmdrsu.com",
				"j+p+h+d+d+p+z.j.k.g@rfpycgjuf.com", "zygekdy.l.w+s@snh.owpyu.com", "j+m.l+ia+qdgv+w@rfpycgjuf.com",
				"r+hwbjwefkp@wcjaki.n.com", "zygekdy.l.w+d@snh.owpyu.com", "bizdm+sz.f.a.k@il.cjjlp.com",
				"hfmeqzk.isx+t@fiidmdrsu.com", "hfmeqzk.isx+i@fiidmdrsu.com", "bizdm+f+j+m.l.l@il.cjjlp.com",
				"zygekdy.l.w+g@snh.owpyu.com", "r+evgvxmksf@wcjaki.n.com", "hfmeqzk.isx+h@fiidmdrsu.com",
				"bizdm+lov+cy@il.cjjlp.com", "hfmeqzk.isx+o@fiidmdrsu.com", "bizdm+hs+qao@il.cjjlp.com",
				"r+v+z+rcuznrj@wcjaki.n.com", "j+r.kn+h.w.a.h+bh@rfpycgjuf.com", "hfmeqzk.isx+t@fiidmdrsu.com",
				"hfmeqzk.isx+a@fiidmdrsu.com", "zygekdy.l.w+o@snh.owpyu.com", "zygekdy.l.w+i@snh.owpyu.com",
				"r+vy.u.y+f.er+aw@wcjaki.n.com", "zygekdy.l.w+c@snh.owpyu.com", "bizdm+wztzg@il.cjjlp.com",
				"j+h.fwbsr+chp@rfpycgjuf.com", "zygekdy.l.w+s@snh.owpyu.com", "zygekdy.l.w+d@snh.owpyu.com",
				"bizdm+qq.o.q+p@il.cjjlp.com", "zygekdy.l.w+o@snh.owpyu.com", "j+c+zqbq+h.dyt@rfpycgjuf.com",
				"r+hl.b.i+fz.hz.t@wcjaki.n.com", "r+cbabpf.k+w+e@wcjaki.n.com" };
		int l = emails.length;
		HashMap<String, Integer> hm = new HashMap<>();
		String loc_name = new String();
		String dom_name = new String();
		String full_email = new String();
		String[] name = new String[l * 2];
		for (int i = 0; i < l; i++) {
			System.out.println(name);
			name = emails[i].split("@");
			dom_name = name[1];

			loc_name = name[0].substring(0, (name[0].indexOf('+')));
			loc_name = loc_name.replace(".", "");
			full_email = loc_name + dom_name;

			if (hm.containsKey(full_email)) {
				hm.put(full_email, hm.get(full_email) + 1);
			} else {
				hm.put(full_email, 1);
			}
			System.out.println(hm);

			loc_name = "";
			dom_name = "";
			full_email = "";

		}
		return hm.size();
	}
}
