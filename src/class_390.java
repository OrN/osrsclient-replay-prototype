
// $FF: renamed from: nw
final class class_390 implements class_23 {

   // $FF: renamed from: be int
   static final int field_4241 = 512;
   // $FF: renamed from: n int
   static final int field_4242 = 4;


   // $FF: renamed from: <init> () void
   class_390() {
      super();
   }

   // $FF: renamed from: b (java.lang.Long, nd, int) void
   void method_6769(Long var1, Buffer var2) {
      try {
         var2.writeLongReversed(var1.longValue());
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: n (nd, int) java.lang.Object
   public Object method_75(Buffer var1) {
      try {
         return Long.valueOf(var1.readLong());
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: v (java.lang.Object, nd, int) void
   public void method_73(Object var1, Buffer var2) {
      try {
         this.method_6769((Long)var1, var2);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: f (java.lang.Object, nd) void
   public void method_71(Object var1, Buffer var2) {
      this.method_6769((Long)var1, var2);
   }

   // $FF: renamed from: y (java.lang.Object, nd) void
   public void method_72(Object var1, Buffer var2) {
      this.method_6769((Long)var1, var2);
   }

   // $FF: renamed from: p (nd) java.lang.Object
   public Object method_70(Buffer var1) {
      return Long.valueOf(var1.readLong());
   }

   // $FF: renamed from: j (nd) java.lang.Object
   public Object method_69(Buffer var1) {
      return Long.valueOf(var1.readLong());
   }

   // $FF: renamed from: r (nd) java.lang.Object
   public Object method_74(Buffer var1) {
      return Long.valueOf(var1.readLong());
   }

   // $FF: renamed from: d (java.lang.Long, nd) void
   void method_6770(Long var1, Buffer var2) {
      var2.writeLongReversed(var1.longValue());
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
         throw class_223.method_4281(var4);
      }
   }
}
