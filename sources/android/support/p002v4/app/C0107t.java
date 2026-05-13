package android.support.p002v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* renamed from: android.support.v4.app.t */
/* loaded from: classes.dex */
class C0107t {

    /* renamed from: android.support.v4.app.t$a */
    /* loaded from: classes.dex */
    public static class C0112a {

        /* renamed from: a */
        public View f364a;
    }

    /* renamed from: android.support.v4.app.t$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0113b {
        /* renamed from: a */
        View mo13467a();
    }

    /* renamed from: a */
    public static String m13488a(View view) {
        return view.getTransitionName();
    }

    /* renamed from: a */
    public static Object m13485a(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return obj;
    }

    /* renamed from: a */
    public static Object m13483a(Object obj, View view, ArrayList<View> arrayList, Map<String, View> map, View view2) {
        if (obj != null) {
            m13469b(arrayList, view);
            if (map != null) {
                arrayList.removeAll(map.values());
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            arrayList.add(view2);
            m13470b((Transition) obj, arrayList);
            return obj;
        }
        return obj;
    }

    /* renamed from: a */
    public static void m13481a(Object obj, View view, boolean z) {
        ((Transition) obj).excludeTarget(view, z);
    }

    /* renamed from: a */
    public static void m13486a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: a */
    public static void m13484a(Object obj, View view) {
        final Rect m13468c = m13468c(view);
        ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: android.support.v4.app.t.1
            @Override // android.transition.Transition.EpicenterCallback
            public Rect onGetEpicenter(Transition transition) {
                return m13468c;
            }
        });
    }

    /* renamed from: b */
    public static Object m13471b(Object obj) {
        Transition transition;
        if (obj == null || (transition = (Transition) obj) == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(transition);
        return transitionSet;
    }

    /* renamed from: a */
    public static void m13480a(Object obj, Object obj2, final View view, final InterfaceC0113b interfaceC0113b, final View view2, C0112a c0112a, final Map<String, String> map, final ArrayList<View> arrayList, Map<String, View> map2, final Map<String, View> map3, ArrayList<View> arrayList2) {
        if (obj != null || obj2 != null) {
            final Transition transition = (Transition) obj;
            if (transition != null) {
                transition.addTarget(view2);
            }
            if (obj2 != null) {
                m13482a(obj2, view2, map2, arrayList2);
            }
            if (interfaceC0113b != null) {
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: android.support.v4.app.t.2
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (transition != null) {
                            transition.removeTarget(view2);
                        }
                        View mo13467a = interfaceC0113b.mo13467a();
                        if (mo13467a != null) {
                            if (!map.isEmpty()) {
                                C0107t.m13473a((Map<String, View>) map3, mo13467a);
                                map3.keySet().retainAll(map.values());
                                for (Map.Entry entry : map.entrySet()) {
                                    View view3 = (View) map3.get((String) entry.getValue());
                                    if (view3 != null) {
                                        view3.setTransitionName((String) entry.getKey());
                                    }
                                }
                            }
                            if (transition != null) {
                                C0107t.m13469b(arrayList, mo13467a);
                                arrayList.removeAll(map3.values());
                                arrayList.add(view2);
                                C0107t.m13470b(transition, arrayList);
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                });
            }
            m13489a(transition, c0112a);
        }
    }

    /* renamed from: a */
    public static Object m13479a(Object obj, Object obj2, Object obj3, boolean z) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition == null || transition2 == null) {
            z = true;
        }
        if (z) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            if (transition2 != null) {
                transitionSet.addTransition(transition2);
            }
            if (transition3 != null) {
                transitionSet.addTransition(transition3);
                return transitionSet;
            }
            return transitionSet;
        }
        TransitionSet transitionSet2 = null;
        if (transition2 != null && transition != null) {
            transitionSet2 = new TransitionSet().addTransition(transition2).addTransition(transition).setOrdering(1);
        } else if (transition2 != null) {
            transitionSet2 = transition2;
        } else if (transition != null) {
            transitionSet2 = transition;
        }
        if (transition3 != null) {
            TransitionSet transitionSet3 = new TransitionSet();
            if (transitionSet2 != null) {
                transitionSet3.addTransition(transitionSet2);
            }
            transitionSet3.addTransition(transition3);
            return transitionSet3;
        }
        return transitionSet2;
    }

    /* renamed from: a */
    public static void m13482a(Object obj, View view, Map<String, View> map, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        arrayList.clear();
        arrayList.addAll(map.values());
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m13475a(targets, arrayList.get(i));
        }
        arrayList.add(view);
        m13470b(transitionSet, arrayList);
    }

    /* renamed from: a */
    private static void m13475a(List<View> list, View view) {
        int size = list.size();
        if (!m13474a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m13474a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m13474a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m13489a(Transition transition, final C0112a c0112a) {
        if (transition != null) {
            transition.setEpicenterCallback(new Transition.EpicenterCallback() { // from class: android.support.v4.app.t.3

                /* renamed from: b */
                private Rect f352b;

                @Override // android.transition.Transition.EpicenterCallback
                public Rect onGetEpicenter(Transition transition2) {
                    if (this.f352b == null && C0112a.this.f364a != null) {
                        this.f352b = C0107t.m13468c(C0112a.this.f364a);
                    }
                    return this.f352b;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static Rect m13468c(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m13469b(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.isTransitionGroup()) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m13469b(arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    /* renamed from: a */
    public static void m13473a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m13473a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m13487a(final View view, final View view2, Object obj, final ArrayList<View> arrayList, Object obj2, final ArrayList<View> arrayList2, Object obj3, final ArrayList<View> arrayList3, Object obj4, final ArrayList<View> arrayList4, final Map<String, View> map) {
        final Transition transition = (Transition) obj;
        final Transition transition2 = (Transition) obj2;
        final Transition transition3 = (Transition) obj3;
        final Transition transition4 = (Transition) obj4;
        if (transition4 != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: android.support.v4.app.t.4
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (transition != null) {
                        C0107t.m13478a(transition, arrayList);
                    }
                    if (transition2 != null) {
                        C0107t.m13478a(transition2, arrayList2);
                    }
                    if (transition3 != null) {
                        C0107t.m13478a(transition3, arrayList3);
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        ((View) entry.getValue()).setTransitionName((String) entry.getKey());
                    }
                    int size = arrayList4.size();
                    for (int i = 0; i < size; i++) {
                        transition4.excludeTarget((View) arrayList4.get(i), false);
                    }
                    transition4.excludeTarget(view2, false);
                    return true;
                }
            });
        }
    }

    /* renamed from: a */
    public static void m13478a(Object obj, ArrayList<View> arrayList) {
        List<View> targets;
        Transition transition = (Transition) obj;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            for (int i = 0; i < transitionCount; i++) {
                m13478a(transitionSet.getTransitionAt(i), arrayList);
            }
        } else if (!m13490a(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget(arrayList.get(size));
            }
        }
    }

    /* renamed from: b */
    public static void m13470b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            for (int i = 0; i < transitionCount; i++) {
                m13470b(transitionSet.getTransitionAt(i), arrayList);
            }
        } else if (!m13490a(transition) && m13476a((List) transition.getTargets())) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                transition.addTarget(arrayList.get(i2));
            }
        }
    }

    /* renamed from: a */
    private static boolean m13490a(Transition transition) {
        return (m13476a((List) transition.getTargetIds()) && m13476a((List) transition.getTargetNames()) && m13476a((List) transition.getTargetTypes())) ? false : true;
    }

    /* renamed from: a */
    private static boolean m13476a(List list) {
        return list == null || list.isEmpty();
    }
}
