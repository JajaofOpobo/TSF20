package android.support.v4.app;

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

/* loaded from: classes.dex */
class r {
    public static String a(View view) {
        return view.getTransitionName();
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return obj;
    }

    public static Object a(Object obj, View view, ArrayList arrayList, Map map, View view2) {
        if (obj != null) {
            b(arrayList, view);
            if (map != null) {
                arrayList.removeAll(map.values());
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            arrayList.add(view2);
            b((Transition) obj, arrayList);
            return obj;
        }
        return obj;
    }

    public static void a(Object obj, View view, boolean z) {
        ((Transition) obj).excludeTarget(view, z);
    }

    public static void a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public static void a(Object obj, View view) {
        final Rect c = c(view);
        ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: android.support.v4.app.r.1
            @Override // android.transition.Transition.EpicenterCallback
            public Rect onGetEpicenter(Transition transition) {
                return c;
            }
        });
    }

    public static void a(Object obj, Object obj2, final View view, final t tVar, final View view2, s sVar, final Map map, final ArrayList arrayList, final Map map2, ArrayList arrayList2) {
        if (obj != null || obj2 != null) {
            final Transition transition = (Transition) obj;
            if (transition != null) {
                transition.addTarget(view2);
            }
            if (obj2 != null) {
                b((Transition) obj2, arrayList2);
            }
            if (tVar != null) {
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: android.support.v4.app.r.2
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                        View a = tVar.a();
                        if (a != null) {
                            if (!map.isEmpty()) {
                                r.a(map2, a);
                                map2.keySet().retainAll(map.values());
                                for (Map.Entry entry : map.entrySet()) {
                                    View view3 = (View) map2.get((String) entry.getValue());
                                    if (view3 != null) {
                                        view3.setTransitionName((String) entry.getKey());
                                    }
                                }
                            }
                            if (transition == null) {
                                return true;
                            }
                            r.b(arrayList, a);
                            arrayList.removeAll(map2.values());
                            arrayList.add(view2);
                            transition.removeTarget(view2);
                            r.b(transition, arrayList);
                            return true;
                        }
                        return true;
                    }
                });
            }
            a(transition, sVar);
        }
    }

    public static Object a(Object obj, Object obj2, Object obj3, boolean z) {
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
        Transition transition4 = null;
        if (transition2 != null && transition != null) {
            transition4 = new TransitionSet().addTransition(transition2).addTransition(transition).setOrdering(1);
        } else if (transition2 != null) {
            transition4 = transition2;
        } else if (transition != null) {
            transition4 = transition;
        }
        if (transition3 == null) {
            return transition4;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition4 != null) {
            transitionSet2.addTransition(transition4);
        }
        transitionSet2.addTransition(transition3);
        return transitionSet2;
    }

    private static void a(Transition transition, final s sVar) {
        if (transition != null) {
            transition.setEpicenterCallback(new Transition.EpicenterCallback() { // from class: android.support.v4.app.r.3
                private Rect a;

                @Override // android.transition.Transition.EpicenterCallback
                public Rect onGetEpicenter(Transition transition2) {
                    if (this.a == null && s.this.a != null) {
                        this.a = r.c(s.this.a);
                    }
                    return this.a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Rect c(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(ArrayList arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.isTransitionGroup()) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    b(arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    public static void a(Map map, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public static void a(final View view, final View view2, Object obj, final ArrayList arrayList, Object obj2, final ArrayList arrayList2, Object obj3, final ArrayList arrayList3, Object obj4, final ArrayList arrayList4, final Map map) {
        final Transition transition = (Transition) obj;
        final Transition transition2 = (Transition) obj2;
        final Transition transition3 = (Transition) obj3;
        final Transition transition4 = (Transition) obj4;
        if (transition4 != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: android.support.v4.app.r.4
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (transition != null) {
                        transition.removeTarget(view2);
                        r.a(transition, arrayList);
                    }
                    if (transition2 != null) {
                        r.a(transition2, arrayList2);
                    }
                    if (transition3 != null) {
                        r.a(transition3, arrayList3);
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

    public static void a(Object obj, ArrayList arrayList) {
        List<View> targets;
        Transition transition = (Transition) obj;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            for (int i = 0; i < transitionCount; i++) {
                a(transitionSet.getTransitionAt(i), arrayList);
            }
            return;
        }
        if (!a(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget((View) arrayList.get(size));
            }
        }
    }

    public static void b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            for (int i = 0; i < transitionCount; i++) {
                b(transitionSet.getTransitionAt(i), arrayList);
            }
            return;
        }
        if (!a(transition) && a((List) transition.getTargets())) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                transition.addTarget((View) arrayList.get(i2));
            }
        }
    }

    private static boolean a(Transition transition) {
        return (a((List) transition.getTargetIds()) && a((List) transition.getTargetNames()) && a((List) transition.getTargetTypes())) ? false : true;
    }

    private static boolean a(List list) {
        return list == null || list.isEmpty();
    }
}
