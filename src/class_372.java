import java.util.HashMap;

// $FF: renamed from: mu
public class class_372 {

   // $FF: renamed from: v jv
   class_306 field_4111;
   // $FF: renamed from: n jv
   class_306 field_4112;
   // $FF: renamed from: f java.util.HashMap
   HashMap field_4113;
   // $FF: renamed from: d op
   static class_66 field_4114;


   // $FF: renamed from: <init> (jv, jv) void
   public class_372(class_306 var1, class_306 var2) {
      super();
      try {
         this.field_4111 = var1;
         this.field_4112 = var2;
         this.field_4113 = new HashMap();
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: v (mv[], int) java.util.HashMap
   public HashMap method_6611(class_373[] var1, int var2) {
      try {
         HashMap var3 = new HashMap();
         class_373[] var4 = var1;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            if(var2 == -987560303) {
               throw new IllegalStateException();
            }

            class_373 var6 = var4[var5];
            if(this.field_4113.containsKey(var6)) {
               if(var2 == -987560303) {
                  throw new IllegalStateException();
               }

               var3.put(var6, this.field_4113.get(var6));
            } else {
               class_69 var7 = class_206.method_4140(this.field_4111, this.field_4112, var6.field_4121, "");
               if(null != var7) {
                  if(var2 == -987560303) {
                     throw new IllegalStateException();
                  }

                  this.field_4113.put(var6, var7);
                  var3.put(var6, var7);
               }
            }
         }

         return var3;
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

   // $FF: renamed from: n (mv[]) java.util.HashMap
   public HashMap method_6612(class_373[] var1) {
      HashMap var2 = new HashMap();
      class_373[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class_373 var5 = var3[var4];
         if(this.field_4113.containsKey(var5)) {
            var2.put(var5, this.field_4113.get(var5));
         } else {
            class_69 var6 = class_206.method_4140(this.field_4111, this.field_4112, var5.field_4121, "");
            if(null != var6) {
               this.field_4113.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }
}
