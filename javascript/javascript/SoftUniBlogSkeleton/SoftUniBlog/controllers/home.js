module.exports = {
  index: (req, res) => {
      res.render('home/index');
  }
};
require('./../models/User');
require('./../models/Articles');

const Article=mongoose.model('Article');
module.exports={
    index:(req, res) =>{
        Article.find({}).limit(6).populate('author').then(articles => {
            res.render('home/index', {articles: articles});
        })
    }
};