import java.util.Iterator;

// $FF: renamed from: nu
public class class_259 extends class_258 implements class_11 {

   // $FF: renamed from: y int
   final int field_2901;
   // $FF: renamed from: f hn
   final class_264 field_2902;
   // $FF: renamed from: n jv
   final class_306 field_2903;


   // $FF: renamed from: b (int) ml
   protected class_367 method_4952(int var1) {
      class_264 var3 = this.field_2902;
      synchronized(this.field_2902) {
         class_368 var2 = (class_368)this.field_2902.method_5002((long)var1);
         if(null == var2) {
            var2 = this.method_4962(var1, 1894552867);
            this.field_2902.method_5005(var2, (long)var1);
         }

         return var2;
      }
   }

   // $FF: renamed from: <init> (jd, int, kk, jv) void
   public class_259(int var2, class_306 var4) {
      super(var4 != null?var4.method_5393(var2):0);
      try {
         class_264 var10001 = new class_264(64);
         this.field_2902 = var10001;
         this.field_2903 = var4;
         this.field_2901 = var2 * 2024001031;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: g (int, int) mq
   class_368 method_4962(int var1, int var2) {
      try {
         byte[] var3 = this.field_2903.method_5381(640434103 * this.field_2901, var1);
         class_368 var10000 = new class_368();
         class_368 var4 = var10000;
         if(var3 != null) {
            if(var2 == 1710975487) {
               throw new IllegalStateException();
            }

            class_28 var10001 = new class_28(var3);
            var4.method_6568(var10001, -1490587397);
         }

         return var4;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: a (int) void
   public void method_4963() {
      try {
         class_264 var2 = this.field_2902;
         synchronized(this.field_2902) {
            this.field_2902.method_5008();
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: v (int, int) ml
   protected class_367 method_4958(int var1, int var2) {
      try {
         class_264 var4 = this.field_2902;
         synchronized(this.field_2902) {
            class_368 var3 = (class_368)this.field_2902.method_5002((long)var1);
            if(null == var3) {
               if(var2 <= 937261733) {
                  throw new IllegalStateException();
               }

               var3 = this.method_4962(var1, -436721199);
               this.field_2902.method_5005(var3, (long)var1);
            }

            return var3;
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: aj () java.util.Iterator
   public Iterator method_4964() {
      class_379 var10000 = new class_379(this);
      return var10000;
   }

   // $FF: renamed from: p (int) ml
   protected class_367 method_4950(int var1) {
      class_264 var3 = this.field_2902;
      synchronized(this.field_2902) {
         class_368 var2 = (class_368)this.field_2902.method_5002((long)var1);
         if(null == var2) {
            var2 = this.method_4962(var1, 82985845);
            this.field_2902.method_5005(var2, (long)var1);
         }

         return var2;
      }
   }

   // $FF: renamed from: j (int) ml
   protected class_367 method_4954(int var1) {
      class_264 var3 = this.field_2902;
      synchronized(this.field_2902) {
         class_368 var2 = (class_368)this.field_2902.method_5002((long)var1);
         if(null == var2) {
            var2 = this.method_4962(var1, -837073601);
            this.field_2902.method_5005(var2, (long)var1);
         }

         return var2;
      }
   }

   // $FF: renamed from: r (int) ml
   protected class_367 method_4955(int var1) {
      class_264 var3 = this.field_2902;
      synchronized(this.field_2902) {
         class_368 var2 = (class_368)this.field_2902.method_5002((long)var1);
         if(null == var2) {
            var2 = this.method_4962(var1, 1993077627);
            this.field_2902.method_5005(var2, (long)var1);
         }

         return var2;
      }
   }

   public Iterator iterator() {
      try {
         class_379 var10000 = new class_379(this);
         return var10000;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: k (int) mq
   class_368 method_4965(int var1) {
      byte[] var2 = this.field_2903.method_5381(640434103 * this.field_2901, var1);
      class_368 var10000 = new class_368();
      class_368 var3 = var10000;
      if(var2 != null) {
         class_28 var10001 = new class_28(var2);
         var3.method_6568(var10001, -1626168705);
      }

      return var3;
   }

   // $FF: renamed from: m (int) mq
   class_368 method_4966(int var1) {
      byte[] var2 = this.field_2903.method_5381(640434103 * this.field_2901, var1);
      class_368 var10000 = new class_368();
      class_368 var3 = var10000;
      if(var2 != null) {
         class_28 var10001 = new class_28(var2);
         var3.method_6568(var10001, 1374663449);
      }

      return var3;
   }

   // $FF: renamed from: x () void
   public void method_4967() {
      class_264 var1 = this.field_2902;
      synchronized(this.field_2902) {
         this.field_2902.method_5008();
      }
   }

   // $FF: renamed from: z () void
   public void method_4968() {
      class_264 var1 = this.field_2902;
      synchronized(this.field_2902) {
         this.field_2902.method_5008();
      }
   }

   // $FF: renamed from: r (jv, java.lang.String, java.lang.String, byte) oh[]
   public static class_67[] method_4969(class_306 var0, String var1, String var2) {
      try {
         int var4 = var0.method_5399(var1);
         int var5 = var0.method_5400(var4, var2);
         return class_80.method_1338(var0, var4, var5);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }
}
