import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// $FF: renamed from: dk
public class class_197 {

   // $FF: renamed from: n mr
   static final class_369 field_2334;
   // $FF: renamed from: o bu
   public static class_157 field_2335;
   // $FF: renamed from: f ko
   static final class_328 field_2336;
   // $FF: renamed from: y int
   static int field_2337;
   // $FF: renamed from: v java.util.Map
   static final Map field_2338;


   // $FF: renamed from: g (int, int) bi
   static class_101 method_3992(int var0, int var1) {
      class_175 var2 = (class_175)field_2338.get(Integer.valueOf(var0));
      return var2.method_3733(var1, -94614591);
   }

   // $FF: renamed from: x (int) int
   static int method_3993(int var0) {
      class_175 var1 = (class_175)field_2338.get(Integer.valueOf(var0));
      return null == var1?0:var1.method_3731((byte)-84);
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_2338 = new HashMap();
      class_369 var10000 = new class_369(1024);
      field_2334 = var10000;
      class_328 var0 = new class_328();
      field_2336 = var0;
      field_2337 = 0;
   }

   // $FF: renamed from: u (int, java.lang.String, java.lang.String) void
   static void method_3995(int var0, String var1, String var2) {
      class_54.method_585(var0, var1, var2, (String)null, 938379962);
   }

   // $FF: renamed from: l (int, java.lang.String, java.lang.String, java.lang.String) void
   static void method_3996(int var0, String var1, String var2, String var3) {
      class_175 var4 = (class_175)field_2338.get(Integer.valueOf(var0));
      if(null == var4) {
         class_175 var10000 = new class_175();
         var4 = var10000;
         field_2338.put(Integer.valueOf(var0), var4);
      }

      class_101 var5 = var4.method_3732(var0, var1, var2, var3, -1507239774);
      field_2334.method_6588(var5, (long)(-2090663702 * var5.field_1183));
      field_2336.method_5797(var5);
      client.field_1611 = -625396947 * client.field_1602;
   }

   // $FF: renamed from: o (int, java.lang.String, java.lang.String, java.lang.String) void
   static void method_3997(int var0, String var1, String var2, String var3) {
      class_175 var4 = (class_175)field_2338.get(Integer.valueOf(var0));
      if(null == var4) {
         class_175 var10000 = new class_175();
         var4 = var10000;
         field_2338.put(Integer.valueOf(var0), var4);
      }

      class_101 var5 = var4.method_3732(var0, var1, var2, var3, 870545880);
      field_2334.method_6588(var5, (long)(1017616665 * var5.field_1183));
      field_2336.method_5797(var5);
      client.field_1611 = -625396947 * client.field_1602;
   }

   // $FF: renamed from: c (int, java.lang.String, java.lang.String, java.lang.String) void
   static void method_3998(int var0, String var1, String var2, String var3) {
      class_175 var4 = (class_175)field_2338.get(Integer.valueOf(var0));
      if(null == var4) {
         class_175 var10000 = new class_175();
         var4 = var10000;
         field_2338.put(Integer.valueOf(var0), var4);
      }

      class_101 var5 = var4.method_3732(var0, var1, var2, var3, 83831568);
      field_2334.method_6588(var5, (long)(441207077 * var5.field_1183));
      field_2336.method_5797(var5);
      client.field_1611 = 369281077 * client.field_1602;
   }

   // $FF: renamed from: e (int, int) bi
   static class_101 method_3999(int var0, int var1) {
      class_175 var2 = (class_175)field_2338.get(Integer.valueOf(var0));
      return var2.method_3733(var1, -94614591);
   }

   // $FF: renamed from: i (int) int
   static int method_4000(int var0) {
      class_101 var1 = (class_101)field_2334.method_6586((long)var0);
      return null == var1?-1:(field_2336.field_3849 == var1.field_471?-1:1017616665 * ((class_101)var1.field_471).field_1183);
   }

   // $FF: renamed from: <init> () void
   class_197() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "dk.<init>(" + ')');
      }
   }

   // $FF: renamed from: w () void
   static void method_4002() {
      field_2338.clear();
      field_2334.method_6596();
      field_2336.method_5807();
      field_2337 = 0;
   }

   // $FF: renamed from: m (int) int
   static int method_4003(int var0) {
      class_175 var1 = (class_175)field_2338.get(Integer.valueOf(var0));
      return null == var1?0:var1.method_3731((byte)-37);
   }

   // $FF: renamed from: k (int) int
   static int method_4004(int var0) {
      class_175 var1 = (class_175)field_2338.get(Integer.valueOf(var0));
      return null == var1?0:var1.method_3731((byte)-5);
   }

   // $FF: renamed from: z (int) int
   static int method_4005(int var0) {
      class_175 var1 = (class_175)field_2338.get(Integer.valueOf(var0));
      return null == var1?0:var1.method_3731((byte)-73);
   }

   // $FF: renamed from: s (int, java.lang.String, java.lang.String) void
   static void method_4006(int var0, String var1, String var2) {
      class_54.method_585(var0, var1, var2, (String)null, 13605444);
   }

   // $FF: renamed from: t () void
   static void method_4007() {
      field_2338.clear();
      field_2334.method_6596();
      field_2336.method_5807();
      field_2337 = 0;
   }

   // $FF: renamed from: h () void
   static void method_4008() {
      field_2338.clear();
      field_2334.method_6596();
      field_2336.method_5807();
      field_2337 = 0;
   }

   // $FF: renamed from: ap (int) int
   static int method_4009(int var0) {
      class_101 var1 = (class_101)field_2334.method_6586((long)var0);
      return null == var1?-1:(field_2336.field_3849 == var1.field_471?-1:1017616665 * ((class_101)var1.field_471).field_1183);
   }

   // $FF: renamed from: q () void
   static void method_4010() {
      Iterator var0 = field_2334.iterator();

      while(var0.hasNext()) {
         class_101 var1 = (class_101)var0.next();
         var1.method_1890(2052079508);
      }

   }

   // $FF: renamed from: ae (int) int
   static int method_4011(int var0) {
      class_101 var1 = (class_101)field_2334.method_6586((long)var0);
      return null == var1?-1:(field_2336.field_3849 == var1.field_471?-1:1017616665 * ((class_101)var1.field_471).field_1183);
   }

   // $FF: renamed from: a (int) bi
   static class_101 method_4012(int var0) {
      return (class_101)field_2334.method_6586((long)var0);
   }

   // $FF: renamed from: ab (int) int
   static int method_4013(int var0) {
      class_101 var1 = (class_101)field_2334.method_6586((long)var0);
      return null == var1?-1:(field_2336.field_3849 == var1.field_471?-1:4723139 * ((class_101)var1.field_471).field_1183);
   }

   // $FF: renamed from: al (int) int
   static int method_4014(int var0) {
      class_101 var1 = (class_101)field_2334.method_6586((long)var0);
      return var1 == null?-1:(var1.field_469 == field_2336.field_3849?-1:1017616665 * ((class_101)var1.field_469).field_1183);
   }

   // $FF: renamed from: ad (int) int
   static int method_4015(int var0) {
      class_101 var1 = (class_101)field_2334.method_6586((long)var0);
      return var1 == null?-1:(var1.field_469 == field_2336.field_3849?-1:1017616665 * ((class_101)var1.field_469).field_1183);
   }

   // $FF: renamed from: v (kj[], int, int) kj
   public static class_14 method_4016(class_14[] var0, int var1, int var2) {
      try {
         class_14[] var3 = var0;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            if(var2 != -611336247) {
               throw new IllegalStateException();
            }

            class_14 var5 = var3[var4];
            if(var1 == var5.method_50(-907662946)) {
               if(var2 != -611336247) {
                  throw new IllegalStateException();
               }

               return var5;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "dk.v(" + ')');
      }
   }
}
