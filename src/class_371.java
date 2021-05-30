import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// $FF: renamed from: mt
public class class_371 implements class_17 {

   // $FF: renamed from: s int
   static final int field_4105 = 5;
   // $FF: renamed from: n ne
   final class_21 field_4106;
   // $FF: renamed from: br java.lang.String
   static String field_4107;
   // $FF: renamed from: a int
   static final int field_4108 = 18;
   // $FF: renamed from: x int
   static final int field_4109 = 2097152;
   // $FF: renamed from: v java.util.Map
   Map field_4110;


   // $FF: renamed from: v (int, int) int
   public int method_53(int var1, int var2) {
      try {
         if(this.field_4110 != null) {
            if(var2 >= 846473429) {
               throw new IllegalStateException();
            }

            class_396 var3 = (class_396)this.field_4110.get(Integer.valueOf(var1));
            if(var3 != null) {
               if(var2 >= 846473429) {
                  throw new IllegalStateException();
               }

               return ((Integer)var3.field_4254).intValue();
            }
         }

         return ((Integer)this.field_4106.method_62(var1, -1572379722)).intValue();
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: f (int) int
   public int method_55(int var1) {
      if(this.field_4110 != null) {
         class_396 var2 = (class_396)this.field_4110.get(Integer.valueOf(var1));
         if(var2 != null) {
            return ((Integer)var2.field_4254).intValue();
         }
      }

      return ((Integer)this.field_4106.method_62(var1, -691452187)).intValue();
   }

   // $FF: renamed from: n (int, java.lang.Object, int) void
   public void method_54(int var1, Object var2, int var3) {
      try {
         Map var10000;
         Integer var10001;
         class_396 var10002;
         if(null == this.field_4110) {
            if(var3 <= -2132198079) {
               throw new IllegalStateException();
            }

            this.field_4110 = new HashMap();
            var10000 = this.field_4110;
            var10001 = Integer.valueOf(var1);
            var10002 = new class_396(var1, var2);
            var10000.put(var10001, var10002);
         } else {
            class_396 var4 = (class_396)this.field_4110.get(Integer.valueOf(var1));
            if(null == var4) {
               var10000 = this.field_4110;
               var10001 = Integer.valueOf(var1);
               var10002 = new class_396(var1, var2);
               var10000.put(var10001, var10002);
            } else {
               var4.field_4254 = var2;
            }
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   public Iterator iterator() {
      try {
         return null == this.field_4110?Collections.emptyList().iterator():this.field_4110.values().iterator();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: aj () java.util.Iterator
   public Iterator method_6608() {
      return null == this.field_4110?Collections.emptyList().iterator():this.field_4110.values().iterator();
   }

   // $FF: renamed from: <init> (ne) void
   public class_371(class_21 var1) {
      super();
      try {
         this.field_4106 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: y (int) int
   public int method_56(int var1) {
      if(this.field_4110 != null) {
         class_396 var2 = (class_396)this.field_4110.get(Integer.valueOf(var1));
         if(var2 != null) {
            return ((Integer)var2.field_4254).intValue();
         }
      }

      return ((Integer)this.field_4106.method_62(var1, -1413633083)).intValue();
   }

   // $FF: renamed from: p (int) int
   public int method_58(int var1) {
      if(this.field_4110 != null) {
         class_396 var2 = (class_396)this.field_4110.get(Integer.valueOf(var1));
         if(var2 != null) {
            return ((Integer)var2.field_4254).intValue();
         }
      }

      return ((Integer)this.field_4106.method_62(var1, -1001343798)).intValue();
   }

   // $FF: renamed from: j (int, java.lang.Object) void
   public void method_57(int var1, Object var2) {
      Map var10000;
      Integer var10001;
      class_396 var10002;
      if(null == this.field_4110) {
         this.field_4110 = new HashMap();
         var10000 = this.field_4110;
         var10001 = Integer.valueOf(var1);
         var10002 = new class_396(var1, var2);
         var10000.put(var10001, var10002);
      } else {
         class_396 var3 = (class_396)this.field_4110.get(Integer.valueOf(var1));
         if(null == var3) {
            var10000 = this.field_4110;
            var10001 = Integer.valueOf(var1);
            var10002 = new class_396(var1, var2);
            var10000.put(var10001, var10002);
         } else {
            var3.field_4254 = var2;
         }
      }

   }
}
