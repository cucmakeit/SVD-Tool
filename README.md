## SVD-Tool

Baseline Predictors:

![](https://github.com/cucmakeit/SVD-Tool/blob/master/img/baseline.png)

Baseline Predictors使用向量bi表示物品i的评分相对于平均评分的偏差，向量bu表示用户u做出的评分相对于平均评分的偏差，将平均评分记做μ。



### SVD:

SVD就是一种加入Baseline Predictors优化的matrix factorization model。

SVD公式如下：

![](https://github.com/cucmakeit/SVD-Tool/blob/master/img/SVD-%E5%85%AC%E5%BC%8F.png)

加入防止过拟合的 λ 参数，可以得到下面的优化函数：

![](https://github.com/cucmakeit/SVD-Tool/blob/master/img/SVD-%E4%BC%98%E5%8C%96%E5%87%BD%E6%95%B0.png)

对上述公式求导，我们可以得到最终的求解函数:

![](https://github.com/cucmakeit/SVD-Tool/blob/master/img/SVD-%E6%9B%B4%E6%96%B0%E5%85%AC%E5%BC%8F.png) 


     
     
     
### SVD++:

SVD算法是指在SVD的基础上引入隐式反馈，使用用户的历史浏览数据、用户历史评分数据、物品的历史浏览数据、物品的历史评分数据等作为新的参数。

![](https://github.com/cucmakeit/SVD-Tool/blob/master/img/SVD%2B%2B.png)

求解公式如下：

![](https://github.com/cucmakeit/SVD-Tool/blob/master/img/SVD%2B%2B%E6%9B%B4%E6%96%B0%E5%85%AC%E5%BC%8F.png)