package Medium;

public class RectangleArea {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int separate = (C - A) * (D - B) + (G - E) * (H - F);
		int intersection = (Math.min(C, G) - Math.max(A, E)) * (Math.min(D, H) - Math.max(B, F));
		if (A >= G || B >= H || C <= E || D <= F)
			return separate;
		return separate - intersection;
	}
}
