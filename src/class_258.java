
// $FF: renamed from: me
public abstract class class_258 extends class_257 implements class_21 {

   // $FF: renamed from: pt int
   static final int field_2899 = 503;
   // $FF: renamed from: au int
   static final int field_2900 = 57;


   // $FF: renamed from: p (int) ml
   protected abstract class_367 method_4950(int var1);

   // $FF: renamed from: <init> (jd, kk, int) void
   protected class_258(int var3) {
      super(var3);
      try {
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: n (int) int
   public int method_4951() {
      try {
         return -1948210145 * this.field_2898;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: f (int, int) java.lang.Object
   public Object method_62(int var1, int var2) {
      try {
         class_367 var3 = this.method_4958(var1, 1474971375);
         if(null != var3) {
            if(var3.method_6573(-1118376221)) {
               return var3.method_6571(-334523720);
            }

            if(var2 >= -105803942) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: b (int) ml
   protected abstract class_367 method_4952(int var1);

   // $FF: renamed from: y (nd, byte) oc
   public class_396 method_4953(class_28 var1, byte var2) {
      try {
         int var3 = var1.method_132();
         class_367 var4 = this.method_4958(var3, 1996028065);
         class_396 var10000 = new class_396(var3);
         class_396 var5 = var10000;
         Class var6 = var4.field_4095.field_4214;
         if(var6 == Integer.class) {
            if(var2 <= 8) {
               throw new IllegalStateException();
            }

            var5.field_4254 = Integer.valueOf(var1.method_135());
         } else if(Long.class == var6) {
            if(var2 <= 8) {
               throw new IllegalStateException();
            }

            var5.field_4254 = Long.valueOf(var1.method_136());
         } else if(var6 == String.class) {
            if(var2 <= 8) {
               throw new IllegalStateException();
            }

            var5.field_4254 = var1.method_140((byte)75);
         } else {
            if(!class_22.class.isAssignableFrom(var6)) {
               throw new IllegalStateException();
            }

            if(var2 <= 8) {
               throw new IllegalStateException();
            }

            try {
               class_22 var7 = (class_22)var6.newInstance();
               var7.method_68(var1, 1837811366);
               var5.field_4254 = var7;
            } catch (InstantiationException var8) {
               ;
            } catch (IllegalAccessException var9) {
               ;
            }
         }

         return var5;
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

   // $FF: renamed from: j (int) ml
   protected abstract class_367 method_4954(int var1);

   // $FF: renamed from: r (int) ml
   protected abstract class_367 method_4955(int var1);

   // $FF: renamed from: l (int) java.lang.Object
   public Object method_63(int var1) {
      class_367 var2 = this.method_4958(var1, 1125251908);
      return null != var2 && var2.method_6573(-1118376221)?var2.method_6571(-1960375574):null;
   }

   // $FF: renamed from: d () int
   public int method_4956() {
      return -1948210145 * this.field_2898;
   }

   // $FF: renamed from: s () int
   public int method_4957() {
      return -1948210145 * this.field_2898;
   }

   // $FF: renamed from: v (int, int) ml
   protected abstract class_367 method_4958(int var1, int var2);

   // $FF: renamed from: u () int
   public int method_4959() {
      return -1948210145 * this.field_2898;
   }

   // $FF: renamed from: o (int) java.lang.Object
   public Object method_64(int var1) {
      class_367 var2 = this.method_4958(var1, 1710358186);
      return null != var2 && var2.method_6573(-1118376221)?var2.method_6571(-240651776):null;
   }

   // $FF: renamed from: c (int) java.lang.Object
   public Object method_65(int var1) {
      class_367 var2 = this.method_4958(var1, 1859649702);
      return null != var2 && var2.method_6573(-1118376221)?var2.method_6571(815662959):null;
   }

   // $FF: renamed from: e (nd) oc
   public class_396 method_4960(class_28 var1) {
      int var2 = var1.method_132();
      class_367 var3 = this.method_4958(var2, 1185225265);
      class_396 var10000 = new class_396(var2);
      class_396 var4 = var10000;
      Class var5 = var3.field_4095.field_4214;
      if(var5 == Integer.class) {
         var4.field_4254 = Integer.valueOf(var1.method_135());
      } else if(Long.class == var5) {
         var4.field_4254 = Long.valueOf(var1.method_136());
      } else if(var5 == String.class) {
         var4.field_4254 = var1.method_140((byte)9);
      } else {
         if(!class_22.class.isAssignableFrom(var5)) {
            throw new IllegalStateException();
         }

         try {
            class_22 var6 = (class_22)var5.newInstance();
            var6.method_68(var1, 1947656716);
            var4.field_4254 = var6;
         } catch (InstantiationException var7) {
            ;
         } catch (IllegalAccessException var8) {
            ;
         }
      }

      return var4;
   }
}
