import java.util.Collection;
import java.util.Iterator;

// $FF: renamed from: ki
public class class_323 implements Iterable, Collection {

   // $FF: renamed from: n mw
   class_27 field_3810;
   // $FF: renamed from: v mw
   class_27 field_3811;


   // $FF: renamed from: bq (java.util.Collection) boolean
   public boolean method_5695() {
      throw new RuntimeException();
   }

   // $FF: renamed from: v () void
   public void method_5696() {
      while(this.field_3811.field_10 != this.field_3811) {
         this.field_3811.field_10.method_108();
      }

   }

   // $FF: renamed from: n (mw) void
   public void method_5697(class_27 var1) {
      if(var1.field_11 != null) {
         var1.method_108();
      }

      var1.field_11 = this.field_3811.field_11;
      var1.field_10 = this.field_3811;
      var1.field_11.field_10 = var1;
      var1.field_10.field_11 = var1;
   }

   // $FF: renamed from: f (mw) void
   public void method_5698(class_27 var1) {
      if(var1.field_11 != null) {
         var1.method_108();
      }

      var1.field_11 = this.field_3811;
      var1.field_10 = this.field_3811.field_10;
      var1.field_11.field_10 = var1;
      var1.field_10.field_11 = var1;
   }

   // $FF: renamed from: ai () int
   int method_5699() {
      int var1 = 0;

      for(class_27 var2 = this.field_3811.field_10; var2 != this.field_3811; var2 = var2.field_10) {
         ++var1;
      }

      return var1;
   }

   // $FF: renamed from: p () mw
   public class_27 method_5700() {
      return this.method_5701((class_27)null);
   }

   // $FF: renamed from: j (mw) mw
   class_27 method_5701(class_27 var1) {
      class_27 var2;
      if(var1 == null) {
         var2 = this.field_3811.field_10;
      } else {
         var2 = var1;
      }

      if(var2 == this.field_3811) {
         this.field_3810 = null;
         return null;
      } else {
         this.field_3810 = var2.field_10;
         return var2;
      }
   }

   // $FF: renamed from: r () mw
   public class_27 method_5702() {
      class_27 var1 = this.field_3810;
      if(var1 == this.field_3811) {
         this.field_3810 = null;
         return null;
      } else {
         this.field_3810 = var1.field_10;
         return var1;
      }
   }

   // $FF: renamed from: b () int
   int method_5703() {
      int var1 = 0;

      for(class_27 var2 = this.field_3811.field_10; var2 != this.field_3811; var2 = var2.field_10) {
         ++var1;
      }

      return var1;
   }

   // $FF: renamed from: d () boolean
   public boolean method_5704() {
      return this.field_3811.field_10 == this.field_3811;
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public Iterator iterator() {
      class_330 var10000 = new class_330(this);
      return var10000;
   }

   // $FF: renamed from: q (mw) mw
   class_27 method_5705(class_27 var1) {
      class_27 var2;
      if(var1 == null) {
         var2 = this.field_3811.field_10;
      } else {
         var2 = var1;
      }

      if(var2 == this.field_3811) {
         this.field_3810 = null;
         return null;
      } else {
         this.field_3810 = var2.field_10;
         return var2;
      }
   }

   public boolean isEmpty() {
      return this.method_5704();
   }

   // $FF: renamed from: as () mw[]
   class_27[] method_5706() {
      class_27[] var1 = new class_27[this.method_5703()];
      int var2 = 0;

      for(class_27 var3 = this.field_3811.field_10; var3 != this.field_3811; var3 = var3.field_10) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public Object[] toArray() {
      return this.method_5708();
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(class_27 var3 = this.field_3811.field_10; var3 != this.field_3811; var3 = var3.field_10) {
         var1[var2++] = var3;
      }

      return var1;
   }

   // $FF: renamed from: u (mw) boolean
   boolean method_5707(class_27 var1) {
      this.method_5697(var1);
      return true;
   }

   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   // $FF: renamed from: s () mw[]
   class_27[] method_5708() {
      class_27[] var1 = new class_27[this.method_5703()];
      int var2 = 0;

      for(class_27 var3 = this.field_3811.field_10; var3 != this.field_3811; var3 = var3.field_10) {
         var1[var2++] = var3;
      }

      return var1;
   }

   // $FF: renamed from: aw () java.lang.Object[]
   public Object[] method_5709() {
      return this.method_5708();
   }

   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   public void clear() {
      this.method_5696();
   }

   // $FF: renamed from: ax () mw[]
   class_27[] method_5710() {
      class_27[] var1 = new class_27[this.method_5703()];
      int var2 = 0;

      for(class_27 var3 = this.field_3811.field_10; var3 != this.field_3811; var3 = var3.field_10) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   public int hashCode() {
      try {
         return super.hashCode();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: eg (java.lang.Object) boolean
   public boolean method_5711(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: eo (java.lang.Object) boolean
   public boolean method_5712(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: fl (java.lang.Object) boolean
   public boolean method_5713(Object var1) {
      return super.equals(var1);
   }

   public int abu() {
      return super.hashCode();
   }

   public int abl() {
      return super.hashCode();
   }

   public boolean add(Object var1) {
      return this.method_5707((class_27)var1);
   }

   // $FF: renamed from: l () void
   public void method_5714() {
      while(this.field_3811.field_10 != this.field_3811) {
         this.field_3811.field_10.method_108();
      }

   }

   // $FF: renamed from: o () void
   public void method_5715() {
      while(this.field_3811.field_10 != this.field_3811) {
         this.field_3811.field_10.method_108();
      }

   }

   // $FF: renamed from: ap () mw
   public class_27 method_5716() {
      class_27 var1 = this.field_3810;
      if(var1 == this.field_3811) {
         this.field_3810 = null;
         return null;
      } else {
         this.field_3810 = var1.field_10;
         return var1;
      }
   }

   // $FF: renamed from: e () void
   public void method_5717() {
      while(this.field_3811.field_10 != this.field_3811) {
         this.field_3811.field_10.method_108();
      }

   }

   // $FF: renamed from: g (mw) void
   public void method_5718(class_27 var1) {
      if(var1.field_11 != null) {
         var1.method_108();
      }

      var1.field_11 = this.field_3811.field_11;
      var1.field_10 = this.field_3811;
      var1.field_11.field_10 = var1;
      var1.field_10.field_11 = var1;
   }

   // $FF: renamed from: a (mw) void
   public void method_5719(class_27 var1) {
      if(var1.field_11 != null) {
         var1.method_108();
      }

      var1.field_11 = this.field_3811;
      var1.field_10 = this.field_3811.field_10;
      var1.field_11.field_10 = var1;
      var1.field_10.field_11 = var1;
   }

   // $FF: renamed from: k (mw) void
   public void method_5720(class_27 var1) {
      if(var1.field_11 != null) {
         var1.method_108();
      }

      var1.field_11 = this.field_3811;
      var1.field_10 = this.field_3811.field_10;
      var1.field_11.field_10 = var1;
      var1.field_10.field_11 = var1;
   }

   // $FF: renamed from: m (mw, mw) void
   public static void method_5721(class_27 var0, class_27 var1) {
      if(var0.field_11 != null) {
         var0.method_108();
      }

      var0.field_11 = var1;
      var0.field_10 = var1.field_10;
      var0.field_11.field_10 = var0;
      var0.field_10.field_11 = var0;
   }

   // $FF: renamed from: c () void
   public void method_5722() {
      while(this.field_3811.field_10 != this.field_3811) {
         this.field_3811.field_10.method_108();
      }

   }

   public int aco() {
      return super.hashCode();
   }

   // $FF: renamed from: w () mw
   public class_27 method_5723() {
      return this.method_5701((class_27)null);
   }

   // $FF: renamed from: t () mw
   public class_27 method_5724() {
      return this.method_5701((class_27)null);
   }

   // $FF: renamed from: bl (java.util.Collection) boolean
   public boolean method_5725() {
      throw new RuntimeException();
   }

   public int size() {
      return this.method_5703();
   }

   // $FF: renamed from: i (mw) mw
   class_27 method_5726(class_27 var1) {
      class_27 var2;
      if(var1 == null) {
         var2 = this.field_3811.field_10;
      } else {
         var2 = var1;
      }

      if(var2 == this.field_3811) {
         this.field_3810 = null;
         return null;
      } else {
         this.field_3810 = var2.field_10;
         return var2;
      }
   }

   // $FF: renamed from: ao (java.lang.Object) boolean
   public boolean method_5727() {
      throw new RuntimeException();
   }

   // $FF: renamed from: x (mw, mw) void
   public static void method_5728(class_27 var0, class_27 var1) {
      if(var0.field_11 != null) {
         var0.method_108();
      }

      var0.field_11 = var1;
      var0.field_10 = var1.field_10;
      var0.field_11.field_10 = var0;
      var0.field_10.field_11 = var0;
   }

   // $FF: renamed from: an (mw) boolean
   boolean method_5729(class_27 var1) {
      this.method_5697(var1);
      return true;
   }

   // $FF: renamed from: al () mw
   public class_27 method_5730() {
      class_27 var1 = this.field_3810;
      if(var1 == this.field_3811) {
         this.field_3810 = null;
         return null;
      } else {
         this.field_3810 = var1.field_10;
         return var1;
      }
   }

   // $FF: renamed from: z () mw
   public class_27 method_5731() {
      return this.method_5701((class_27)null);
   }

   // $FF: renamed from: aj () java.util.Iterator
   public Iterator method_5732() {
      class_330 var10000 = new class_330(this);
      return var10000;
   }

   // $FF: renamed from: ar () boolean
   public boolean method_5733() {
      return this.field_3811.field_10 == this.field_3811;
   }

   // $FF: renamed from: ag () boolean
   public boolean method_5734() {
      return this.field_3811.field_10 == this.field_3811;
   }

   // $FF: renamed from: ak (java.lang.Object[]) java.lang.Object[]
   public Object[] method_5735(Object[] var1) {
      int var2 = 0;

      for(class_27 var3 = this.field_3811.field_10; var3 != this.field_3811; var3 = var3.field_10) {
         var1[var2++] = var3;
      }

      return var1;
   }

   // $FF: renamed from: av () boolean
   public boolean method_5736() {
      return this.method_5704();
   }

   // $FF: renamed from: <init> () void
   public class_323() {
      super();
      class_27 var10001 = new class_27();
      this.field_3811 = var10001;
      this.field_3811.field_10 = this.field_3811;
      this.field_3811.field_11 = this.field_3811;
   }

   // $FF: renamed from: am () int
   public int method_5738() {
      return this.method_5703();
   }

   // $FF: renamed from: az () int
   public int method_5739() {
      return this.method_5703();
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   // $FF: renamed from: ac () boolean
   public boolean method_5740() {
      return this.method_5704();
   }

   // $FF: renamed from: at (java.lang.Object) boolean
   public boolean method_5741() {
      throw new RuntimeException();
   }

   // $FF: renamed from: ah (java.lang.Object) boolean
   public boolean method_5742() {
      throw new RuntimeException();
   }

   // $FF: renamed from: y (mw, mw) void
   public static void method_5743(class_27 var0, class_27 var1) {
      if(var0.field_11 != null) {
         var0.method_108();
      }

      var0.field_11 = var1;
      var0.field_10 = var1.field_10;
      var0.field_11.field_10 = var0;
      var0.field_10.field_11 = var0;
   }

   // $FF: renamed from: aq () java.lang.Object[]
   public Object[] method_5744() {
      return this.method_5708();
   }

   // $FF: renamed from: ad () int
   int method_5745() {
      int var1 = 0;

      for(class_27 var2 = this.field_3811.field_10; var2 != this.field_3811; var2 = var2.field_10) {
         ++var1;
      }

      return var1;
   }

   // $FF: renamed from: af () java.lang.Object[]
   public Object[] method_5746() {
      return this.method_5708();
   }

   // $FF: renamed from: bt (java.lang.Object) boolean
   public boolean method_5747() {
      throw new RuntimeException();
   }

   // $FF: renamed from: ay (mw) boolean
   boolean method_5748(class_27 var1) {
      this.method_5697(var1);
      return true;
   }

   // $FF: renamed from: ae () mw
   public class_27 method_5749() {
      class_27 var1 = this.field_3810;
      if(var1 == this.field_3811) {
         this.field_3810 = null;
         return null;
      } else {
         this.field_3810 = var1.field_10;
         return var1;
      }
   }

   // $FF: renamed from: au (mw) boolean
   boolean method_5750(class_27 var1) {
      this.method_5697(var1);
      return true;
   }

   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   // $FF: renamed from: ab () mw
   public class_27 method_5751() {
      class_27 var1 = this.field_3810;
      if(var1 == this.field_3811) {
         this.field_3810 = null;
         return null;
      } else {
         this.field_3810 = var1.field_10;
         return var1;
      }
   }

   // $FF: renamed from: br (java.lang.Object) boolean
   public boolean method_5752(Object var1) {
      return this.method_5707((class_27)var1);
   }

   // $FF: renamed from: h (mw) mw
   class_27 method_5753(class_27 var1) {
      class_27 var2;
      if(var1 == null) {
         var2 = this.field_3811.field_10;
      } else {
         var2 = var1;
      }

      if(var2 == this.field_3811) {
         this.field_3810 = null;
         return null;
      } else {
         this.field_3810 = var2.field_10;
         return var2;
      }
   }

   // $FF: renamed from: bu (java.util.Collection) boolean
   public boolean method_5754() {
      throw new RuntimeException();
   }

   // $FF: renamed from: aa (mw) boolean
   boolean method_5755(class_27 var1) {
      this.method_5697(var1);
      return true;
   }

   // $FF: renamed from: bv (java.util.Collection) boolean
   public boolean method_5756() {
      throw new RuntimeException();
   }

   // $FF: renamed from: bm (java.util.Collection) boolean
   public boolean method_5757() {
      throw new RuntimeException();
   }

   // $FF: renamed from: bz (java.util.Collection) boolean
   public boolean method_5758() {
      throw new RuntimeException();
   }

   // $FF: renamed from: bh (java.util.Collection) boolean
   public boolean method_5759() {
      throw new RuntimeException();
   }

   // $FF: renamed from: bs () void
   public void method_5760() {
      this.method_5696();
   }

   // $FF: renamed from: bd (java.lang.Object) boolean
   public boolean method_5761() {
      throw new RuntimeException();
   }
}
