
// $FF: renamed from: nw
final class class_390 implements class_23 {

   // $FF: renamed from: be int
   static final int field_4241 = 512;
   // $FF: renamed from: n int
   static final int field_4242 = 4;


   // $FF: renamed from: <init> () void
   void method_6768() {
      super();
   }

   // $FF: renamed from: b (java.lang.Long, nd, int) void
   void method_6769(Long var1, class_28 var2, int var3) {
      try {
         var2.method_341(var1.longValue());
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "nw.b(" + ')');
      }
   }

   // $FF: renamed from: n (nd, int) java.lang.Object
   public Object method_75(class_28 var1, int var2) {
      try {
         return Long.valueOf(var1.method_136(-405209203));
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "nw.n(" + ')');
      }
   }

   // $FF: renamed from: v (java.lang.Object, nd, int) void
   public void method_73(Object var1, class_28 var2, int var3) {
      try {
         this.method_6769((Long)var1, var2, -1988673452);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "nw.v(" + ')');
      }
   }

   // $FF: renamed from: f (java.lang.Object, nd) void
   public void method_71(Object var1, class_28 var2) {
      this.method_6769((Long)var1, var2, 1317716229);
   }

   // $FF: renamed from: y (java.lang.Object, nd) void
   public void method_72(Object var1, class_28 var2) {
      this.method_6769((Long)var1, var2, 323448793);
   }

   // $FF: renamed from: p (nd) java.lang.Object
   public Object method_70(class_28 var1) {
      return Long.valueOf(var1.method_136(1017277254));
   }

   // $FF: renamed from: j (nd) java.lang.Object
   public Object method_69(class_28 var1) {
      return Long.valueOf(var1.method_136(1163263687));
   }

   // $FF: renamed from: r (nd) java.lang.Object
   public Object method_74(class_28 var1) {
      return Long.valueOf(var1.method_136(-1110889468));
   }

   // $FF: renamed from: d (java.lang.Long, nd) void
   void method_6770(Long var1, class_28 var2) {
      var2.method_341(var1.longValue());
   }

   // $FF: renamed from: ge (int) void
   static void method_6771(int var0) {
      try {
         int var1 = class_195.field_2313 * -1143549299;
         int[] var2 = class_195.field_2318;

         for(int var3 = 0; var3 < var1; ++var3) {
            if(var0 != -1793660977) {
               throw new IllegalStateException();
            }

            if(var2[var3] != 845336023 * client.field_1544) {
               if(var0 != -1793660977) {
                  throw new IllegalStateException();
               }

               if(var2[var3] == client.field_1534 * 929092845) {
                  if(var0 != -1793660977) {
                     throw new IllegalStateException();
                  }
               } else {
                  class_208.method_4144(client.field_1605[var2[var3]], true, 1913665958);
               }
            }
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "nw.ge(" + ')');
      }
   }
}
